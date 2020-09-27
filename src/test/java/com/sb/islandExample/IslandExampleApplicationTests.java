package com.sb.islandExample;

import com.sb.islandExample.request.InputRequest;
import com.sb.islandExample.service.IslandService;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
@RunWith(JUnit4.class)
class IslandExampleApplicationTests {

	public static int[][] grid1;
	public static int[][] grid2;

	@BeforeEach
	public void init() {
		 grid1 = new int[][]{
				 {0, 0, 0, 0, 0, 0, 0, 0},
				 {0, 1, 1, 1, 0, 0, 0, 0},
				 {0, 1, 1, 0, 0, 0, 1, 0},
				 {0, 0, 1, 0, 0, 0, 1, 0},
				 {1, 0, 0, 0, 0, 0, 0, 0},
				 {1, 0, 0, 0, 1, 0, 1, 0},
				 {0, 0, 0, 0, 0, 0, 1, 0},
				 {0, 0, 1, 0, 1, 0, 0, 0}};

		 grid2 = new int[][]{
				{ 0, 0, 1, 0, 0, 0, 1, 0 },
				{ 0, 1, 0, 1, 0, 0, 1, 0 },
				{ 1, 0, 1, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 1, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 1, 0, 1, 0 },
				{ 0, 1, 0, 0, 0, 1, 0, 0 },
				{ 1, 0, 0, 0, 0, 1, 0, 0 },
				{ 0, 1, 1, 1, 1, 0, 0, 1 } };
	}


	@Autowired
	private IslandService islandService;

	@Test
	void contextLoadsOmniGrid1() {
		InputRequest request = new InputRequest();
		String strategy = "Omni";
		request.setGrid(grid1);
		request.setStrategy(strategy);
		String result  = islandService.getIslandCountByStrategy(request);
		Assert.assertEquals("Count of Island using strategy "+ strategy + " = 7", result);
	}

	@Test
	void contextLoadsOrthoGrid1() {
		InputRequest request = new InputRequest();
		String strategy = "Ortho";
		request.setGrid(grid1);
		request.setStrategy(strategy);
		String result  = islandService.getIslandCountByStrategy(request);
		Assert.assertEquals("Count of Island using strategy "+ strategy + " = 7", result);
	}

	@Test
	void contextLoadsOmniGrid2() {
		InputRequest request = new InputRequest();
		String strategy = "Omni";
		request.setGrid(grid2);
		request.setStrategy(strategy);
		String result  = islandService.getIslandCountByStrategy(request);
		Assert.assertEquals("Count of Island using strategy "+ strategy + " = 3", result);
	}

	@Test
	void contextLoadsOrthoGrid2() {
		InputRequest request = new InputRequest();
		String strategy = "Ortho";
		request.setGrid(grid2);
		request.setStrategy(strategy);
		String result  = islandService.getIslandCountByStrategy(request);
		Assert.assertEquals( "Count of Island using strategy "+ strategy + " = 14", result);
	}


}
