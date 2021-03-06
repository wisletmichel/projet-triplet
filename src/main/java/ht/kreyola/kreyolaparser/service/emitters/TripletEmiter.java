package ht.kreyola.kreyolaparser.service.emitters;

import ht.kreyola.kreyolaparser.model.RichSentence;
import ht.kreyola.kreyolaparser.model.Triplet;

import java.util.List;

public interface TripletEmiter {

    List<Triplet> emit(RichSentence richSentence);
}
