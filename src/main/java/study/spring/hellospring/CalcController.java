package study.spring.hellospring;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import study.spring.hellospring.hello.Calc1;
import study.spring.hellospring.hello.Calc2;
import study.spring.hellospring.hello.Calc3;
import study.spring.hellospring.hello.Calc4;

@Controller
public class CalcController {

	/** 객체 주입 --> 자동할당 */
	@Autowired
	private Calc1 c1;
	@Autowired
	private Calc2 c2;
	@Autowired
	private Calc3 c3;
	@Autowired
	private Calc4 c4;

	/** 이 메서드를 "/calc.do" URL에 GET 방식으로 노출 시킨다. */
	@RequestMapping(value = "/calc.do", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		
		// Spring에 의해 자동으로 주입된 객체의 메서드를 호출한다.
		int value1 = c1.sum();
		int value2 = c2.sum();
		int value3 = c3.sum();
		int value4 = c4.sum();
		
		// 변수값을 View에게 전달한다.
		model.addAttribute("value1", value1);
		model.addAttribute("value2", value2);
		model.addAttribute("value3", value3);
		model.addAttribute("value4", value4);
		
		return "calc";
	}
}
