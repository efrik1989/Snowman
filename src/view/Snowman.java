package view;

import java.awt.*;

public class Snowman extends Canvas {

    @Override
    public void paint(Graphics g) {
        //ноги
        g.setColor(Color.DARK_GRAY);
        g.fillOval(180, 350, 200, 200);
        g.setColor(Color.WHITE);
        g.fillOval(184, 354, 192, 192);
        //туловище
        g.setColor(Color.DARK_GRAY);
        g.fillOval(200, 250, 160, 160);
        g.setColor(Color.WHITE);
        g.fillOval(204, 254, 152, 152);

        g.setColor(Color.DARK_GRAY);
        g.fillOval(220, 160, 120, 120);
        g.setColor(Color.WHITE);
        g.fillOval(224, 164, 112, 112);
        //hat
        g.setColor(Color.DARK_GRAY);
        g.fillOval(210, 160, 140, 30);
        g.setColor(Color.WHITE);
        g.fillOval(214, 164, 132, 22);
        g.setColor(Color.DARK_GRAY);
        g.fillRoundRect(240,100,80,70,15,15);
        g.setColor(Color.WHITE);
        g.fillRoundRect(244,104,72,62,15,15);
        g.setColor(Color.DARK_GRAY);
        g.drawLine(240,150,320,150);
        //eyes
        g.drawOval(270,200,10,10);
        g.drawOval(305,200,10,10);
        //nose
        g.drawPolygon(new int[] {290, 350, 295}, new int[] {220,220,235},3);
        //smile
        g.drawOval(260,240,10,10);
        g.drawOval(275,245,10,10);
        g.drawOval(295,245,10,10);
        g.drawOval(310,240,10,10);

        g.drawOval(285,310,10,10);
        g.drawOval(285,330,10,10);
        g.drawOval(285,350,10,10);

        //g.drawPolygon(new int[] {215, 130, 120, 114, 125, 95, 90, 125, 100, 105, 130, 205}, new int[]
        // {310,290, 280, 283, 220, 217, 218, 223, 228, 230, 232, 223},12);

        g.drawPolygon(new int[] {215, 130, 130, 212}, new int[] {310, 290, 302, 322},4);
        g.drawPolygon(new int[] {120, 95, 93, 122}, new int[] {290, 288, 295, 300}, 4);
        g.drawPolygon(new int[] {130, 115, 108, 120},new int[] {290, 270, 275,290}, 4);
        g.drawPolygon(new int[] {130, 122, 100, 108},new int[]{302,300,312,318}, 4);

        g.drawPolygon(new int[] {345, 480, 480, 342}, new int[] {310, 290, 302, 322},4);
        g.drawPolygon(new int[] {470, 500, 498, 468}, new int[] {290, 288, 295, 300}, 4);
        g.drawPolygon(new int[] {480, 515, 508, 470},new int[] {290, 270, 275,290}, 4);
        g.drawPolygon(new int[] {480, 478, 505, 513},new int[]{302,300,312,318}, 4);
    }
}
