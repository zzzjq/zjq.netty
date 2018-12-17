package zjq.netty.main;

import zjq.netty.client.NettyClient;

/**
 * 
 * @author zhangjq
 * @date 2018年12月17日下午12:38:43
 *
 **/
public class Main {

	public static void main(String[] args){
		String host = "localhost";
		int port = 8090;
		new NettyClient(host, port).start();
	}
	
}
