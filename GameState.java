class GameState
{
	GameState prev;
	byte[] state;

	GameState(GameState _prev)
	{
		prev = _prev;
		state = new byte[22];
	}

  // GameState(GameState _prev, byte[] newState)
	// {
	// 	prev = _prev;
	// 	state = newState.clone();
	// }
}
