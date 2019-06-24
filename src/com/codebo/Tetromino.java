package com.codebo;

/**
 * Author: Zihan
 *
 * @Date: 2019/6/22
 */

import java.util.Arrays;

/**
 * 先写一个公共类，写方块的共同点，
 * 共同点比如说：左移、右移、下落。（形状不是共同点，形状应该写在承继子类）
 * 然后写每一个方块的承继 此类。
 * * 行为：
 * * 	moveLeft（）
 * * 	moveRight（）
 * * 	softDrop（）
 */
public class Tetromino {

    /**
     * 俄罗斯方块由四个Cell拼接。因此下一句意思是建立四个Cell。
     */
    protected Cell[] cells = new Cell[4];

    public void moveLeft() {
        for (Cell cell : cells) {
            cell.left();
        }
    }

    public void moveRight() {
        for (Cell cell : cells) {
            cell.right();
        }
    }

    public void softDrop() {
        for (Cell cell : cells) {
            cell.drop();
        }
    }

    @Override
    public String toString() {
        return "[" + Arrays.toString(cells) + "]";
    }

    /**
     * 随机生成一个四格方块
     * 有7种，分别是TIOSZJL
     * @return tetromino;
     */
    public static Tetromino random() {
        Tetromino tetromino = null;
        int randNum = (int) (Math.random() * 7);
        switch (randNum) {
            case 0:
                tetromino = new T();
                break;
            case 1:
                tetromino = new I();
                break;
            case 2:
                tetromino = new O();
                break;
            case 3:
                tetromino = new S();
                break;
            case 4:
                tetromino = new Z();
                break;
            case 5:
                tetromino = new J();
                break;
            case 6:
                tetromino = new L();
                break;
        }
        return tetromino;
    }


}
