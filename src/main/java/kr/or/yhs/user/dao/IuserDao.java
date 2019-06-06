package kr.or.yhs.user.dao;

import java.util.List;

import kr.or.yhs.paging.model.PageVo;
import kr.or.yhs.user.model.UserVo;

import org.apache.ibatis.session.SqlSession;

public interface IuserDao {
	/**
	 * 
	 * Method : userList
	 * 작성자 : PC03
	 * 변경이력 :
	 * @return
	 * Method 설명 : 사용자 전체 조회
	 */
	List<UserVo> userList();
	
	/**
	 * 
	 * Method : getUser
	 * 작성자 : PC03
	 * 변경이력 :
	 * @param userId
	 * @return
	 * Method 설명 : 사용자 정보 조회
	 */
	UserVo getUser(String userId);
	
	/**
	 * 
	 * Method : userPagingList
	 * 작성자 : PC03
	 * 변경이력 :
	 * @param pageVo
	 * @return
	 * Method 설명 : 사용자 페이징 리스트 조회
	 */
	List<UserVo> userPagingList(PageVo pageVo);
	
	/**
	 * 
	 * Method : usersCnt
	 * 작성자 : PC03
	 * 변경이력 : 
	 * @return
	 * Method 설명 : 사용자 전체수 조회
	 */
	int usersCnt();
	
	/**
	 * 
	 * Method : insertUser
	 * 작성자 : PC03
	 * 변경이력 :
	 * @param iserVo
	 * @return
	 * Method 설명 : 사용자 등록
	 */
	int insertUser(UserVo userVo);
	
	/**
	 * 
	 * Method : deleteUser
	 * 작성자 : PC03
	 * 변경이력 :
	 * @param userId
	 * @return
	 * Method 설명 : 사용자 삭제
	 */
	int deleteUser(String userId);
	
	/**
	 * 
	 * Method : modifyUser
	 * 작성자 : PC03
	 * 변경이력 :
	 * @param userVo
	 * @return
	 * Method 설명 : 사용자정보 수정
	 */
	int modifyUser(UserVo userVo);

	/**
	 * 
	 * Method : userListForPassEncrypt
	 * 작성자 : PC03
	 * 변경이력 :
	 * @param sqlSession
	 * @return
	 * Method 설명 : 비밀번호 암호화 적용대상 사용자 전체 조회
	 */
	List<UserVo> userListForPassEncrypt(SqlSession sqlSession);
	
	/**
	 * 
	 * Method : modifyUserEncryptPass
	 * 작성자 : PC03
	 * 변경이력 :
	 * @param sqlSession
	 * @param userVo
	 * @return
	 * Method 설명 : 사용자 비밀번호 암호화 적용
	 */
	int modifyUserEncryptPass(SqlSession sqlSession, UserVo userVo);
	
	
	
	
}
