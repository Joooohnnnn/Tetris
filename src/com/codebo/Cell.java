package com.codebo;

import java.awt.image.BufferedImage;

/**
 * @Author: Zihan
 * @Date: 2019/6/22
 */

/**
 *  * 俄罗斯方块中的最小单位：方格(Cell)
 *  *
 *  * 特征（属性）:
 *  *   row--行号
 *  *   col--列号
 *  *   image--对应的图片
 *  *
 *  * 行为（方法）:
 *  * 	left();
 *  * 	right();
 *  * 	drop();
 */
public class Cell {

    private int row;
    private int col;
    private BufferedImage image;

    public Cell() {
        super();
    }

    public Cell(int row, int col, BufferedImage image) {
        super();
        this.col = col;
        this.row = row;
        this.image = image;
    }

    public int getRow() {
        return this.row;
    }

    public int getCol() {
        return this.col;
    }

    public BufferedImage getImage() {
        return this.image;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public void setImage(BufferedImage image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "(" + row + ", " + col + ")";
    }

    //向左移动
    public void left() {
        col--;
    }

    //向右移动
    public void right() {
        col++;
    }

    //向下移动
    public void drop() {
        row++;
    }
}
