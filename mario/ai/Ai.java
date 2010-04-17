/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mario.ai;

import mario.core.Direction;
import mario.core.MapObject;

/**
 *
 * @author Danny
 */
abstract public class Ai
{
    protected MapObject mapObject;
    protected Direction direction;
    protected int WALKSPEED = 1;

    public Ai(MapObject mushroom)
    {
        this.mapObject = mushroom;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public void toggleDirection()
    {
        if(getDirection() == direction.RIGHT){
            setDirection(direction.LEFT);

        }
        else if(getDirection() == direction.LEFT)
        {
            setDirection(direction.RIGHT);
        }
    }

    public int getWALKSPEED() {
        return WALKSPEED;
    }

    public void setWALKSPEED(int WALKSPEED) {
        this.WALKSPEED = WALKSPEED;
    }
    public abstract void doLoopAction();
}

