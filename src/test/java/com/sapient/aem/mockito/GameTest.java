package com.sapient.aem.mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import com.sapient.aem.model.Game;
import com.sapient.aem.model.Player;

//@RunWith(MockitoJUnitRunner.class)
@ExtendWith(MockitoExtension.class)
 class GameTest {
	
	@Mock
	Player player;
	
	@InjectMocks
	Game game;
	
	@Test
	public void attackWithSwordTest() throws Exception {
	Mockito.when(((Player) player).getWeapon()).thenReturn("Sword");
	assertEquals("Player attack with: Sword", game.attack());
	}
	}
	

