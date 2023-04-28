package pop;

public class MemberService {

	String id = "hong";
	String password = "12345";

	boolean login(String id, String password) {

		if (this.id.equals(id) && this.password.equals(password)) {

			return true;
		} else {
			return false;
		}

	}

	void logout(String id) {
		System.out.println(id + "님이 로그아웃 되셨습니다.");
	}
}
