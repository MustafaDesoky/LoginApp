package com.companyname.loginpage;

import com.google.gson.annotations.SerializedName;

public class UserInfo{

	@SerializedName("user_status")
	private String userStatus;

	@SerializedName("status_description")
	private String statusDescription;

	@SerializedName("status_code")
	private String statusCode;

	@SerializedName("reset_password_1_flag")
	private int resetPassword1Flag;

	@SerializedName("session_id")
	private String sessionId;

	@SerializedName("reset_password_2_flag")
	private int resetPassword2Flag;

	@SerializedName("full_name")
	private String fullName;

	@SerializedName("maximum_balance")
	private int maximumBalance;

	@SerializedName("user_id")
	private String userId;

	@SerializedName("skey")
	private String skey;

	@SerializedName("current_balance")
	private double currentBalance;

	@SerializedName("status_msg")
	private String statusMsg;

	@SerializedName("opening_balance")
	private int openingBalance;

	public void setUserStatus(String userStatus){
		this.userStatus = userStatus;
	}

	public String getUserStatus(){
		return userStatus;
	}

	public void setStatusDescription(String statusDescription){
		this.statusDescription = statusDescription;
	}

	public String getStatusDescription(){
		return statusDescription;
	}

	public void setStatusCode(String statusCode){
		this.statusCode = statusCode;
	}

	public String getStatusCode(){
		return statusCode;
	}

	public void setResetPassword1Flag(int resetPassword1Flag){
		this.resetPassword1Flag = resetPassword1Flag;
	}

	public int getResetPassword1Flag(){
		return resetPassword1Flag;
	}

	public void setSessionId(String sessionId){
		this.sessionId = sessionId;
	}

	public String getSessionId(){
		return sessionId;
	}

	public void setResetPassword2Flag(int resetPassword2Flag){
		this.resetPassword2Flag = resetPassword2Flag;
	}

	public int getResetPassword2Flag(){
		return resetPassword2Flag;
	}

	public void setFullName(String fullName){
		this.fullName = fullName;
	}

	public String getFullName(){
		return fullName;
	}

	public void setMaximumBalance(int maximumBalance){
		this.maximumBalance = maximumBalance;
	}

	public int getMaximumBalance(){
		return maximumBalance;
	}

	public void setUserId(String userId){
		this.userId = userId;
	}

	public String getUserId(){
		return userId;
	}

	public void setSkey(String skey){
		this.skey = skey;
	}

	public String getSkey(){
		return skey;
	}

	public void setCurrentBalance(double currentBalance){
		this.currentBalance = currentBalance;
	}

	public double getCurrentBalance(){
		return currentBalance;
	}

	public void setStatusMsg(String statusMsg){
		this.statusMsg = statusMsg;
	}

	public String getStatusMsg(){
		return statusMsg;
	}

	public void setOpeningBalance(int openingBalance){
		this.openingBalance = openingBalance;
	}

	public int getOpeningBalance(){
		return openingBalance;
	}

	@Override
 	public String toString(){
		return 
			"UserInfo{" + 
			"user_status = '" + userStatus + '\'' + 
			",status_description = '" + statusDescription + '\'' + 
			",status_code = '" + statusCode + '\'' + 
			",reset_password_1_flag = '" + resetPassword1Flag + '\'' + 
			",session_id = '" + sessionId + '\'' + 
			",reset_password_2_flag = '" + resetPassword2Flag + '\'' + 
			",full_name = '" + fullName + '\'' + 
			",maximum_balance = '" + maximumBalance + '\'' + 
			",user_id = '" + userId + '\'' + 
			",skey = '" + skey + '\'' + 
			",current_balance = '" + currentBalance + '\'' + 
			",status_msg = '" + statusMsg + '\'' + 
			",opening_balance = '" + openingBalance + '\'' + 
			"}";
		}
}