package com.gmail.kat.ui.components;

import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.gmail.kat.ui.util.FontSize;
import com.gmail.kat.ui.util.FontWeight;
import com.gmail.kat.ui.util.LumoStyles;
import com.gmail.kat.ui.util.UIUtils;
import com.gmail.kat.ui.util.css.BorderRadius;

public class Initials extends FlexBoxLayout {

	private String CLASS_NAME = "initials";

	public Initials(String initials) {
		setAlignItems(FlexComponent.Alignment.CENTER);
		setBackgroundColor(LumoStyles.Color.Contrast._10);
		setBorderRadius(BorderRadius.L);
		setClassName(CLASS_NAME);
		UIUtils.setFontSize(FontSize.S, this);
		UIUtils.setFontWeight(FontWeight._600, this);
		setHeight(LumoStyles.Size.M);
		setJustifyContentMode(FlexComponent.JustifyContentMode.CENTER);
		setWidth(LumoStyles.Size.M);

		add(initials);
	}

}
