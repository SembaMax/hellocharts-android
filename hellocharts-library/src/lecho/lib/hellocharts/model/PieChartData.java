package lecho.lib.hellocharts.model;

import java.util.ArrayList;
import java.util.List;

public class PieChartData extends AbstractChartData {
	private ValueFormatter formatter = new NumberValueFormatter();
	private boolean hasLabels = false;
	// TODO: consider Collections.emptyList()
	private List<ArcValue> arcs = new ArrayList<ArcValue>();

	public PieChartData() {
		setAxisX(new Axis().setAutoGenerated(false));
		setAxisY(new Axis().setAutoGenerated(false));
	};

	public PieChartData(List<ArcValue> arcs) {
		setArcs(arcs);
	}

	public List<ArcValue> getArcs() {
		return arcs;
	}

	public void setArcs(List<ArcValue> arcs) {
		if (null == arcs) {
			this.arcs = new ArrayList<ArcValue>();
		} else {
			this.arcs = arcs;
		}
	}

	public boolean hasLabels() {
		return hasLabels;
	}

	public void setHasLabels(boolean hasLabels) {
		this.hasLabels = hasLabels;
	}

	public ValueFormatter getFormatter() {
		return formatter;
	}

	public PieChartData setFormatter(ValueFormatter formatter) {
		if (null == formatter) {
			this.formatter = new NumberValueFormatter();
		} else {
			this.formatter = formatter;
		}
		return this;
	}
}
