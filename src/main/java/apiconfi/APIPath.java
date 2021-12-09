package apiconfi;

public class APIPath {
	public static final class apipath{
public static final String GET_LIST_OF_POSTS="/posts";
public static final String GET_LIST_OF_POST="/posts/2";
public static final String CREAT_USER="/posts";
public static final String DELETE_USER="/api/users/2";
	}
	public static void main(String[] args) {
		System.out.println(APIPath.apipath.GET_LIST_OF_POSTS);
	}
}
