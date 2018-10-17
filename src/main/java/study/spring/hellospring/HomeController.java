package study.spring.hellospring;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * 페이지를 구성하는 메서드
	 * @param locale : 국가설정
	 * @param model : View에게 전달할 데이터의 참조객체
	 * @return String: View의 파일이름
	 */
	// value --> 이 메서드의 URL, method --> 이 메서드가 응답할 요청 방식
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		// 현재 날짜를 국가설정(locale)에 맞추어 생성한다.
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		// model에게 데이터를 전달한다.
		model.addAttribute("serverTime", formattedDate );
		
		// View 파일 이름을 리턴
		return "home";
	}
	
}
