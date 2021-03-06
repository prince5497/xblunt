package maniotrix.xblunt.transporter.util;

import java.net.Authenticator;
import java.net.PasswordAuthentication;

public class Proxy {
	public static String http_Host = "1";
	public static String http_Port = "s";
	public static String http_Username = "f";
	public static String http_Password = "s";
	public static String https_Host = "";
	public static String https_Port = "";
	public static String https_Username = "";
	public static String https_Password = "";
	public static String socksHost = "";
	public static String socksPort = "";
	public static String socksUsername = "";
	public static String socksPassword = "";

	public static void setHttp(String host, String port, String pass,
			String user) {
		System.out.println("Using Http proxy: " + host + ":" + port
				+ " username= " + user + " password= " + pass);
		System.setProperty("http.proxyHost", host);
		System.setProperty("http.proxyPort", port);
		System.setProperty("http.nonProxyHosts", "localhost|127.0.0.1");
		final String username = user;
		final String password = pass;
		if (password != "" && username != "") {
			Authenticator.setDefault(new Authenticator() {
				public PasswordAuthentication getPasswordAuthentication() {
					return new PasswordAuthentication(username, password
							.toCharArray());
				}
			});

			System.setProperty("http.proxyUser", username);
			System.setProperty("http.proxyPassword", password);
		}

	}

	public static void setHttps(String host, String port,
			final String pass, final String user) {
		System.out.println("Using Https proxy: " + host + ":" + port
				+ " username= " + user + " password= " + pass);
		System.setProperty("https.proxyHost", host);
		System.setProperty("https.proxyPort", port);
		System.setProperty("https.nonProxyHosts", "localhost|127.0.0.1");
		final String username = user;
		final String password = pass;
		if (password != "" && username != "") {
			Authenticator.setDefault(new Authenticator() {
				public PasswordAuthentication getPasswordAuthentication() {
					return new PasswordAuthentication(username, password
							.toCharArray());
				}
			});

			System.setProperty("https.proxyUser", username);
			System.setProperty("https.proxyPassword", password);
		}

	}

	public static void setProxySocks_v5(String host, String port,
			final String pass, final String user) {

		System.out.println("Using Socks proxy: " + host + ":" + port
				+ " username= " + user + " password= " + pass);
		System.setProperty("socksProxyVersion", "5");
		System.setProperty("socksProxyHost", host);
		System.setProperty("socksProxyPort", port);
		final String username = user;
		final String password = pass;
		System.setProperty("socks.nonProxyHosts", "localhost|127.0.0.1");
		if (password != "" && username != "") {
			Authenticator.setDefault(new Authenticator() {
				public PasswordAuthentication getPasswordAuthentication() {
					return new PasswordAuthentication(username, password
							.toCharArray());
				}
			});
			System.setProperty("java.net.socks.username", username);
			System.setProperty("java.net.socks.password", password);
		}
	}

	public static void setProxySocks_v4(String host, String port,
			final String password, final String username) {

		System.out.println("Using Socks proxy: " + host + ":" + port
				+ " username= " + username + " password= " + password);
		System.setProperty("socksProxyVersion", "4");
		System.setProperty("socksProxyHost", host);
		System.setProperty("socksProxyPort", port);
		// final String username=user;
		System.setProperty("socks.nonProxyHosts", "localhost|127.0.0.1");
		if (password != "" && username != "") {
			Authenticator.setDefault(new Authenticator() {
				public PasswordAuthentication getPasswordAuthentication() {
					return new PasswordAuthentication(username, password
							.toCharArray());
				}
			});
			System.setProperty("java.net.socks.username", username);
			System.setProperty("java.net.socks.password", password);
		}
	}

	public static void removeProxy() {
		System.clearProperty("http.proxyHost");
		System.clearProperty("http.proxyPort");
		System.clearProperty("http.proxyUser");
		System.clearProperty("http.proxyPassword");

		System.clearProperty("https.proxyHost");
		System.clearProperty("https.proxyPort");
		System.clearProperty("https.proxyUser");
		System.clearProperty("https.proxyPassword");

		System.clearProperty("socksProxyVersion");
		System.clearProperty("socksProxyHost");
		System.clearProperty("socksProxyPort");

		System.clearProperty("java.net.socks.username");
		System.clearProperty("java.net.socks.password");

		System.clearProperty("java.net.useSystemProxies");

		System.setProperty("http.nonProxyHosts", "localhost|127.0.0.1");
		System.setProperty("https.nonProxyHosts", "localhost|127.0.0.1");
		System.setProperty("socks.nonProxyHosts", "localhost|127.0.0.1");
	}

	public static void useProxyhttps() {

		String host = "10.1.1.19";
		String port = "80";
		System.out.println("Using proxy: " + host + ":" + port);
		System.setProperty("https.proxyHost", host);
		System.setProperty("https.proxyPort", port);
		System.setProperty("https.nonProxyHosts", "localhost|127.0.0.1");
		final String authUser = "506.13135079";
		final String authPassword = "iitcc2013";
		Authenticator.setDefault(new Authenticator() {
			public PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(authUser, authPassword
						.toCharArray());
			}
		});

		System.setProperty("https.proxyUser", authUser);
		System.setProperty("https.proxyPassword", authPassword);
	}

	public static void useProxyhttp() {

		String host = "10.1.1.19";
		String port = "80";
		System.out.println("Using proxy: " + host + ":" + port);
		System.setProperty("http.proxyHost", host);
		System.setProperty("http.proxyPort", port);
		System.setProperty("http.nonProxyHosts", "localhost|127.0.0.1");
		final String authUser = "506.13135079";
		final String authPassword = "iitcc2013";
		Authenticator.setDefault(new Authenticator() {
			public PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(authUser, authPassword
						.toCharArray());
			}
		});

		System.setProperty("http.proxyUser", authUser);
		System.setProperty("http.proxyPassword", authPassword);
	}

	public static void useProxyhttps16() {

		String host = "10.1.1.16";
		String port = "80";
		System.out.println("Using proxy: " + host + ":" + port);
		System.setProperty("https.proxyHost", host);
		System.setProperty("https.proxyPort", port);
		System.setProperty("https.nonProxyHosts", "localhost|127.0.0.1");
		final String authUser = "067.9721097213";
		final String authPassword = "kshitizkmr091";
		Authenticator.setDefault(new Authenticator() {
			public PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(authUser, authPassword
						.toCharArray());
			}
		});

		System.setProperty("https.proxyUser", authUser);
		System.setProperty("https.proxyPassword", authPassword);
	}

	public static void useProxyhttp16() {

		String host = "10.1.1.16";
		String port = "80";
		System.out.println("Using proxy: " + host + ":" + port);
		System.setProperty("http.proxyHost", host);
		System.setProperty("http.proxyPort", port);
		System.setProperty("http.nonProxyHosts", "localhost|127.0.0.1");
		final String authUser = "067.9721097213";
		final String authPassword = "kshitizkmr091";
		Authenticator.setDefault(new Authenticator() {
			public PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(authUser, authPassword
						.toCharArray());
			}
		});

		System.setProperty("http.proxyUser", authUser);
		System.setProperty("http.proxyPassword", authPassword);
	}

}