package com.dmcme.boardgame.player;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

/**
 * @author: Darren McMenamin
 * @date: January 23rd 2022
 * Player Class that is used to initiate a new Player
 * Consists of the Players Name
 */

@Getter
@AllArgsConstructor
@ToString
public class Player {

    private String name;

}
