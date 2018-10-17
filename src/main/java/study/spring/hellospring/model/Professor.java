package study.spring.hellospring.model;

/**
 * 하나의 테이블 구조를 표현하기위한 클래스. 
 * 멤버변수는 테이블의 컬럼이름이 된다. 
 * ex) 테이블의 데이터타입이 INT인 경우 멤버변수도 int
 *     그 밖의 경우는 모두 String으로 설정
 */
public class Professor {
	private int profno; // 교수번호
	private String name; // 교수이름
	private String userid; // 아이디
	private String position; // 직급
	private int sal; // 급여
	private String hiredate; // 입사일
	private int comm; // 보직수당 - null 허용
	private int deptno; // 소속학과 번호 - department 테이블을 참조하는 키

	// getter + setter + toString 생성하기 --> Alt+Shift+S 단축키 사용.
	public int getProfno() {
		return profno;
	}

	public void setProfno(int profno) {
		this.profno = profno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

	public String getHiredate() {
		return hiredate;
	}

	public void setHiredate(String hiredate) {
		this.hiredate = hiredate;
	}

	public int getComm() {
		return comm;
	}

	public void setComm(int comm) {
		this.comm = comm;
	}

	public int getDeptno() {
		return deptno;
	}

	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}

	@Override
	public String toString() {
		return "Professor [profno=" + profno + ", name=" + name + ", userid=" + userid + ", position=" + position
				+ ", sal=" + sal + ", hiredate=" + hiredate + ", comm=" + comm + ", deptno=" + deptno + "]";
	}

}
