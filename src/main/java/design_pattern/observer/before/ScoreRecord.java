package design_pattern.observer.before;

import java.util.ArrayList;
import java.util.List;

public class ScoreRecord {
	private List<Integer> scores;
	private List<DataSheetView> dataSheetViews;
	private MinMaxView minMaxView;
	
	public ScoreRecord() {
		scores = new ArrayList<>();
		dataSheetViews = new ArrayList<>();
	}

	public void addDataSheetView(DataSheetView dataSheetView){
		dataSheetViews.add(dataSheetView);
	}
	
	public void setMinMaxView(MinMaxView minMaxView) {
		this.minMaxView = minMaxView;
	}


	public void addScore(int score){
		scores.add(score);
		for(DataSheetView dataSheetView : dataSheetViews){
			dataSheetView.update();
		}
		minMaxView.update();
	}

	public List<Integer> getScores() {
		return scores;
	}
	
}
