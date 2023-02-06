package com.companyname.loginpage;

import com.google.gson.annotations.SerializedName;

public class MainUserData {

	@SerializedName("login_id")
	private String loginId;

	@SerializedName("password")
	private String password;

	@SerializedName("channel_code")
	private String channelCode;

	@SerializedName("client_version")
	private String clientVersion;

	@SerializedName("terminal_id")
	private String terminalId;

	@SerializedName("channel_key")
	private String channelKey;

	public MainUserData(String loginId, String password, String channelCode, String clientVersion, String terminalId, String channelKey) {
		this.loginId = loginId;
		this.password = password;
		this.channelCode = channelCode;
		this.clientVersion = clientVersion;
		this.terminalId = terminalId;
		this.channelKey = channelKey;
	}

	public void setLoginId(String loginId){
		this.loginId = loginId;
	}

	public String getLoginId(){
		return loginId;
	}

	public void setPassword(String password){
		this.password = password;
	}

	public String getPassword(){
		return password;
	}

	public void setChannelCode(String channelCode){
		this.channelCode = channelCode;
	}

	public String getChannelCode(){
		return channelCode;
	}

	public void setClientVersion(String clientVersion){
		this.clientVersion = clientVersion;
	}

	public String getClientVersion(){
		return clientVersion;
	}

	public void setTerminalId(String terminalId){
		this.terminalId = terminalId;
	}

	public String getTerminalId(){
		return terminalId;
	}

	public void setChannelKey(String channelKey){
		this.channelKey = channelKey;
	}

	public String getChannelKey(){
		return channelKey;
	}

	@Override
 	public String toString(){
		return 
			"MainUserResponse{" + 
			"login_id = '" + loginId + '\'' + 
			",password = '" + password + '\'' + 
			",channel_code = '" + channelCode + '\'' + 
			",client_version = '" + clientVersion + '\'' + 
			",terminal_id = '" + terminalId + '\'' + 
			",channel_key = '" + channelKey + '\'' + 
			"}";
		}
}