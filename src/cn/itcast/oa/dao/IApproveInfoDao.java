package cn.itcast.oa.dao;

import java.util.List;

import cn.itcast.oa.base.IBaseDao;
import cn.itcast.oa.domain.ApproveInfo;

public interface IApproveInfoDao extends IBaseDao<ApproveInfo> {

	List<ApproveInfo> findApproveListByApplicationId(Long applicationId);

}
