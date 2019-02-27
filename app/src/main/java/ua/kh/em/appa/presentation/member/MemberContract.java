package ua.kh.em.appa.presentation.member;

import android.widget.EditText;

import ua.kh.em.appa.base.BasePresenter;
import ua.kh.em.appa.base.BaseView;
import ua.kh.em.appa.data.model.Member;

@SuppressWarnings("WeakerAccess")
public interface MemberContract {

    interface View extends BaseView<Presenter>{
        void loadUserDetail(Member user);
        void showSuccess(String message);
        void showFailed(String message);
        void navigateToNextPage();
        void refreshPage(String email);
        void logOut();
    }

    interface Presenter extends BasePresenter{
        void getUserEmail(String email);
        void logOut(String email);
        void getUserDetail(Member user);
        void deleteAccount(String email);
        boolean validateUpdateFields(EditText[] fields);
    }
}
