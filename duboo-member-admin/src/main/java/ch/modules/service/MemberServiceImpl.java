package ch.modules.service;

/**
 * Description:
 *
 * @author cy
 * @date 2019年05月17日 16:26
 * version 1.0
 */
public class MemberServiceImpl implements MemberService {

    @Override
    public String getUser(Long aLong) {
        System.out.println("会员接口被调用！");
        return "会员id为："+aLong;
    }
}
