package com.andy.utils;

import android.graphics.PointF;
import android.view.View;

public class MyAnimatableView {
	PointF curPoint ;
	View m_v;

	public MyAnimatableView(View v) {
		curPoint = new PointF(v.getX(),v.getY());
		m_v = v;
	}

	public PointF getCurPointF() {
		return curPoint;
	}

	public void setPoint(PointF p) {
		curPoint = p;
		m_v.setX(p.x);
		m_v.setY(p.y);
	}
}