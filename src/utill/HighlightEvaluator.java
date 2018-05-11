/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utill;

import com.toedter.calendar.IDateEvaluator;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HighlightEvaluator implements IDateEvaluator {

    private final List<Date> list = new ArrayList<>();

    public void add(Date date) {
        list.add(date);
    }

    @Override
    public boolean isSpecial(Date date) {
        return list.contains(date);
    }

    @Override
    public Color getSpecialForegroundColor() {
        return Color.red.darker();
    }

    @Override
    public Color getSpecialBackroundColor() {
        return Color.blue;
    }

    @Override
    public String getSpecialTooltip() {
        return "Highlighted event.";
    }

    @Override
    public boolean isInvalid(Date date) {
        return false;
    }

    @Override
    public Color getInvalidForegroundColor() {
        return null;
    }

    @Override
    public Color getInvalidBackroundColor() {
        return null;
    }

    @Override
    public String getInvalidTooltip() {
        return null;
    }
}
