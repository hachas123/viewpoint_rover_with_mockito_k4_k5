package com.codemanship.marsrover;

import org.junit.Test;
import refactoring.SimpleViewPoint;

import static org.assertj.core.api.Assertions.assertThat;
import static refactoring.SimpleViewPoint.Heading.*;

public class Heading_ {

	@Test
	public void should_be_created_from_string() {
		assertThat(SimpleViewPoint.Heading.of("N")).isEqualTo(North);
		assertThat(SimpleViewPoint.Heading.of("S")).isEqualTo(South);
		assertThat(SimpleViewPoint.Heading.of("E")).isEqualTo(East);
		assertThat(SimpleViewPoint.Heading.of("W")).isEqualTo(West);
	}

	@Test
	public void should_be_created_from_char() {
		assertThat(SimpleViewPoint.Heading.of('N')).isEqualTo(North);
		assertThat(SimpleViewPoint.Heading.of('S')).isEqualTo(South);
		assertThat(SimpleViewPoint.Heading.of('E')).isEqualTo(East);
		assertThat(SimpleViewPoint.Heading.of('W')).isEqualTo(West);
	}

	@Test
	public void should_be_able_turn_right() {
		assertThat(North.turnRight()).isEqualTo(East);
		assertThat(East.turnRight()).isEqualTo(South);
		assertThat(South.turnRight()).isEqualTo(West);
		assertThat(West.turnRight()).isEqualTo(North);
	}

	@Test
	public void should_be_able_turn_left() {
		assertThat(North.turnLeft()).isEqualTo(West);
		assertThat(East.turnLeft()).isEqualTo(North);
		assertThat(South.turnLeft()).isEqualTo(East);
		assertThat(West.turnLeft()).isEqualTo(South);
	}
}
