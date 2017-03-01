package come.wisely.highlight_spring4.ch3.fortest;

import com.wisely.highlight_spring4.ch3.fortest.TestBean;
import com.wisely.highlight_spring4.ch3.fortest.TestConfig;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by luyongchang on 17/3/1.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {TestBean.class})
@ActiveProfiles("prod")
public class DemoBeanIntegrationTest {
	@Autowired
	private TestBean testBean;

	@Test
	public void prodBeanhouldInjection(){
		String expected = "Fome production profile";
		String actural = testBean.getContent();
		Assert.assertEquals(expected,actural);
	}
}
