import javax.sound.midi.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class BeatBox {


    JPanel mainPanel;
    ArrayList<JCheckBox> checkboxArrayList;
    Sequence sequence;
    Sequencer sequencer;
    Track track;
    JFrame theframe;
    String[] instrumnetName = {"Base Drum","Closed Hi-Hat","Open Hi-Het","Acoustic Snare","Crash Cymbal",
    "Hand Clap","High Tom","Hi Bongo","Maracas","Whistle","Low Conga","Cowbell","Vibraslap","Low-Mid Tom",
            "High Agogo","Open Hi Congo"};

    int[] instrumanets = {35,42,46,38,49,39,50,60,70,72,64,56,58,47,67,63};

    public static void main(String[] args) {
        new BeatBox().buildGUI();
    }
    public void buildGUI(){
        theframe  =  new JFrame("Cyber_BeatBox");
        theframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        BorderLayout layout = new BorderLayout();
        JPanel background = new JPanel(layout);
        background.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));

        checkboxArrayList = new ArrayList<JCheckBox>();
        Box buttonBox = new Box(BoxLayout.Y_AXIS);

        JButton start = new JButton("Start");
        start.addActionListener(new MyStartListner());
        buttonBox.add(start);

        JButton stop = new JButton("Stop");
        stop.addActionListener(new MyStopListner());
        buttonBox.add(stop);

        JButton upTempo = new JButton("Tempo up");
        upTempo.addActionListener(new MyUpTempoListner());
        buttonBox.add(upTempo);

        JButton downTempo = new JButton("Tempo down");
        downTempo.addActionListener(new MyDownTempoListner());
        buttonBox.add(downTempo);

        Box nameBox = new Box(BoxLayout.Y_AXIS);
        for(int i = 0;i<16;i++){
            nameBox.add(new Label(instrumnetName[i]));
        }

        background.add(BorderLayout.EAST,buttonBox);
        background.add(BorderLayout.WEST,nameBox);

        theframe.getContentPane().add(background);

        GridLayout grid = new GridLayout(16,16);
        grid.setVgap(1);
        grid.setVgap(2);
        mainPanel = new JPanel(grid);

        background.add(BorderLayout.CENTER,mainPanel);


        for(int i = 0;i<256;i++){
            JCheckBox c = new JCheckBox();
            c.setSelected(false);
            checkboxArrayList.add(c);
            mainPanel.add(c);

        }
        setUpMide();

        theframe.setBounds(50,50,300,300);
        theframe.pack();
        theframe.setVisible(true);



    }

    public void setUpMide(){

        try {
            sequencer = MidiSystem.getSequencer();
            sequencer.open();
            sequence = new Sequence(Sequence.PPQ,4);
            track = sequence.createTrack();
            sequencer.setTempoInBPM(120);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    public void buildTrackAndStart(){


        int[] trackList = null;
        sequence.deleteTrack(track);
        track = sequence.createTrack();


        for(int i = 0;i<16;i++){
            trackList = new int[16];


            int key = instrumanets[i];

            for(int j = 0;j<16;j++){
                JCheckBox jc = checkboxArrayList.get(j+(16*i));

                if(jc.isSelected()){
                    trackList[j]=key;
                }
                else{
                    trackList[j]=0;
                }
            }

            makeTracks(trackList);
            track.add(makeEvent(176,1,127,0,16));


        }

        track.add(makeEvent(192,9,1,0,15));
        try{
            sequencer.setSequence(sequence);
            sequencer.setLoopCount(sequencer.LOOP_CONTINUOUSLY);
            sequencer.start();
            sequencer.setTempoInBPM(120);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }



    public class MyStartListner implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            buildTrackAndStart();
        }
    }
    public class MyStopListner implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            sequencer.stop();


        }
    }
    public class MyUpTempoListner implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            float tempoFactor = sequencer.getTempoFactor();
            sequencer.setTempoFactor((float) (tempoFactor * 1.03));

        }
    }
    public class MyDownTempoListner implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            float tempoFactor = sequencer.getTempoFactor();
            sequencer.setTempoFactor((float) (tempoFactor * .97));

        }
    }

    public void makeTracks(int[] list){


        for(int i = 0;i<16;i++){
            int key = list[i];

            if(key!=0) {
                track.add(makeEvent(144, 9, key, 100, i));
                track.add(makeEvent(128, 9, key, 100, i + 1));
            }
        }
    }
    public MidiEvent makeEvent(int comd,int chan,int one,int two,int tick){
        MidiEvent event = null;
        try {
            ShortMessage a = new ShortMessage();
            a.setMessage(comd,chan,one,two);
            event = new MidiEvent(a,tick);
        } catch (InvalidMidiDataException e) {
            throw new RuntimeException(e);
        }
        return event;
    }
}
