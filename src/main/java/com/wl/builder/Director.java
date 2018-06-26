package com.wl.builder;

import com.wl.builder.model.BenzModel;

import java.util.ArrayList;
import java.util.List;

public class Director {

    private List<String> sequence = new ArrayList<>();
    private BenzBuilder benzBuilder = new BenzBuilder();
    private AudiBuilder audiBuilder = new AudiBuilder();


    public BenzModel getABenzModel() {
        this.sequence.clear();
        this.sequence.add("start");
        this.sequence.add("stop");
        this.sequence.add("putOnSteam");
        this.benzBuilder.setSequence(this.sequence);
        return (BenzModel) this.benzBuilder.getCarModel();
    }

    public BenzModel getBBenzModel() {
        this.sequence.clear();
        this.sequence.add("start");
        this.sequence.add("putOnSteam");
        this.benzBuilder.setSequence(this.sequence);
        return (BenzModel) this.benzBuilder.getCarModel();
    }
}
