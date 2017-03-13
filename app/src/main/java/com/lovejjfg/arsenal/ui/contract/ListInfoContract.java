package com.lovejjfg.arsenal.ui.contract;

import com.lovejjfg.arsenal.api.mode.ArsenalListInfo;
import com.lovejjfg.arsenal.api.mode.ArsenalUserInfo;
import com.lovejjfg.arsenal.base.BasePresenter;
import com.lovejjfg.arsenal.base.IBaseView;
import com.lovejjfg.arsenal.utils.rxbus.SearchEvent;

/**
 * Created by Joe on 2017/3/9.
 * Email lovejjfg@gmail.com
 */

public interface ListInfoContract {
    interface View extends IBaseView<Presenter> {
        void onRefresh(ArsenalListInfo info);

        void onLoadMore(ArsenalListInfo info);

        void jumpToTarget(ArsenalUserInfo userInfo);

        void atEnd();

        void onRefresh(boolean refresh);

        void setPullRefreshEnable(boolean enable);

        void onSearchEvent(SearchEvent event);
    }

    interface Presenter extends BasePresenter {
        void onItemClick(android.view.View itemView, ArsenalListInfo.ListInfo info);

        void onItemClick(String user);

        void onRefresh();

        void onLoadMore();

        void startSearch(String key);

    }

}
