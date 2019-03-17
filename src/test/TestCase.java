package test;

import java.sql.Date;

import javafx.collections.ObservableList;
import model.Claim;

public class TestCase 
{	
	private Claim testClaim1 = new Claim("claim001", "policy001", "Beijing, China", Date.valueOf("2020-03-15"), "luggage lost", 500, null, "Undealt");
	private Claim testClaim2 = new Claim("claim002", "policy002", "Hangzhou, China", Date.valueOf("2020-04-01"), "broke on the plane", 200, null, "Undealt");
	private Claim testClaim3 = new Claim("claim003", "policy003", "Dublin, Irland", Date.valueOf("2020-09-10"), "lost on the ship", 300, null, "Undealt");
	
	public void addClaimList(ObservableList<Claim> claimData)
	{
		claimData.add(testClaim1);
		claimData.add(testClaim2);
		claimData.add(testClaim3);
	}
}
