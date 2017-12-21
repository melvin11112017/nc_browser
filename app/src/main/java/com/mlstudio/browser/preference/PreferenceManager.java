package com.mlstudio.browser.preference;

import android.content.SharedPreferences;
import android.os.Environment;

import com.mlstudio.browser.MainApp;
import com.mlstudio.browser.constant.Constants;

public class PreferenceManager {


    private static final String PREFERENCES = "settings";
    private static PreferenceManager mInstance;
    private static SharedPreferences mPrefs;

    private PreferenceManager() {
        mPrefs = MainApp.getContext().getSharedPreferences(PREFERENCES, 0);
    }

	public static PreferenceManager getInstance() {
		if (mInstance == null) {
			mInstance = new PreferenceManager();
		}
		return mInstance;
	}

	public boolean getAdBlockEnabled() {
		return mPrefs.getBoolean(Name.BLOCK_ADS, false);
	}

    public void setAdBlockEnabled(boolean enable) {
        putBoolean(Name.BLOCK_ADS, enable);
    }

	public boolean getBlockImagesEnabled() {
		return mPrefs.getBoolean(Name.BLOCK_IMAGES, false);
	}

    public void setBlockImagesEnabled(boolean enable) {
        putBoolean(Name.BLOCK_IMAGES, enable);
    }

	public boolean getBlockThirdPartyCookiesEnabled() {
		return mPrefs.getBoolean(Name.BLOCK_THIRD_PARTY, false);
	}

    public void setBlockThirdPartyCookiesEnabled(boolean enable) {
        putBoolean(Name.BLOCK_THIRD_PARTY, enable);
    }

	public boolean getCheckedForTor() {
		return mPrefs.getBoolean(Name.INITIAL_CHECK_FOR_TOR, false);
	}

    public void setCheckedForTor(boolean check) {
        putBoolean(Name.INITIAL_CHECK_FOR_TOR, check);
    }

	public boolean getCheckedForI2P() {
		return mPrefs.getBoolean(Name.INITIAL_CHECK_FOR_I2P, false);
	}

    public void setCheckedForI2P(boolean check) {
        putBoolean(Name.INITIAL_CHECK_FOR_I2P, check);
    }

	public boolean getClearCacheExit() {
		return mPrefs.getBoolean(Name.CLEAR_CACHE_EXIT, false);
	}

    public void setClearCacheExit(boolean enable) {
        putBoolean(Name.CLEAR_CACHE_EXIT, enable);
    }

	public boolean getClearCookiesExitEnabled() {
		return mPrefs.getBoolean(Name.CLEAR_COOKIES_EXIT, false);
	}

    public void setClearCookiesExitEnabled(boolean enable) {
        putBoolean(Name.CLEAR_COOKIES_EXIT, enable);
    }

	public boolean getClearHistoryExitEnabled() {
		return mPrefs.getBoolean(Name.CLEAR_HISTORY_EXIT, false);
	}

    public void setClearHistoryExitEnabled(boolean enable) {
        putBoolean(Name.CLEAR_HISTORY_EXIT, enable);
    }

	public boolean getColorModeEnabled() {
		return mPrefs.getBoolean(Name.ENABLE_COLOR_MODE, false);
	}

    public void setColorModeEnabled(boolean enable) {
        putBoolean(Name.ENABLE_COLOR_MODE, enable);
    }

	public boolean getCookiesEnabled() {
		return mPrefs.getBoolean(Name.COOKIES, true);
	}

    public void setCookiesEnabled(boolean enable) {
        putBoolean(Name.COOKIES, enable);
    }

	public boolean getDefaultBookmarks() {
		return mPrefs.getBoolean(Name.DEFAULT_BOOKMARKS, true);
	}

    public void setDefaultBookmarks(boolean show) {
        putBoolean(Name.DEFAULT_BOOKMARKS, show);
    }

	public String getDownloadDirectory() {
		return mPrefs.getString(Name.DOWNLOAD_DIRECTORY, Environment.DIRECTORY_DOWNLOADS);
	}

    public void setDownloadDirectory(String directory) {
        putString(Name.DOWNLOAD_DIRECTORY, directory);
    }

	public int getFlashSupport() {
		return mPrefs.getInt(Name.ADOBE_FLASH_SUPPORT, 0);
	}

    public void setFlashSupport(int n) {
        putInt(Name.ADOBE_FLASH_SUPPORT, n);
    }

	public boolean getFullScreenEnabled() {
		return mPrefs.getBoolean(Name.FULL_SCREEN, false);
	}

    public void setFullScreenEnabled(boolean enable) {
        putBoolean(Name.FULL_SCREEN, enable);
    }

	public boolean getGoogleSearchSuggestionsEnabled() {
		return mPrefs.getBoolean(Name.GOOGLE_SEARCH_SUGGESTIONS, true);
	}

    public void setGoogleSearchSuggestionsEnabled(boolean enabled) {
        putBoolean(Name.GOOGLE_SEARCH_SUGGESTIONS, enabled);
    }

	public boolean getHideStatusBarEnabled() {
		return mPrefs.getBoolean(Name.HIDE_STATUS_BAR, true);
	}

    public void setHideStatusBarEnabled(boolean enable) {
        putBoolean(Name.HIDE_STATUS_BAR, enable);
    }

	public String getHomepage() {
		return mPrefs.getString(Name.HOMEPAGE, Constants.HOME_Bookmark);
	}

    public void setHomepage(String homepage) {
        putString(Name.HOMEPAGE, homepage);
    }

	public boolean getIncognitoCookiesEnabled() {
		return mPrefs.getBoolean(Name.INCOGNITO_COOKIES, false);
	}

    public void setIncognitoCookiesEnabled(boolean enable) {
        putBoolean(Name.INCOGNITO_COOKIES, enable);
    }

	public boolean getInvertColors() {
		return mPrefs.getBoolean(Name.INVERT_COLORS, false);
	}

    public void setInvertColors(boolean enable) {
        putBoolean(Name.INVERT_COLORS, enable);
    }

	public boolean getJavaScriptEnabled() {
		return mPrefs.getBoolean(Name.JAVASCRIPT, true);
	}

    public void setJavaScriptEnabled(boolean enable) {
        putBoolean(Name.JAVASCRIPT, enable);
    }

	public boolean getLocationEnabled() {
		return mPrefs.getBoolean(Name.LOCATION, true);
	}

    public void setLocationEnabled(boolean enable) {
        putBoolean(Name.LOCATION, enable);
    }

	public String getMemoryUrl() {
		return mPrefs.getString(Name.URL_MEMORY, "");
	}

    public void setMemoryUrl(String url) {
        putString(Name.URL_MEMORY, url);
    }

	public boolean getOverviewModeEnabled() {
		return mPrefs.getBoolean(Name.OVERVIEW_MODE, true);
	}

    public void setOverviewModeEnabled(boolean enable) {
        putBoolean(Name.OVERVIEW_MODE, enable);
    }

	public boolean getPopupsEnabled() {
		return mPrefs.getBoolean(Name.POPUPS, false);
	}

    public void setPopupsEnabled(boolean enable) {
        putBoolean(Name.POPUPS, enable);
    }

	public String getProxyHost() {
		return mPrefs.getString(Name.USE_PROXY_HOST, "localhost");
	}

    public void setProxyHost(String proxyHost) {
        putString(Name.USE_PROXY_HOST, proxyHost);
    }

	public int getProxyPort() {
		return mPrefs.getInt(Name.USE_PROXY_PORT, 8118);
	}

    public void setProxyPort(int proxyPort) {
        putInt(Name.USE_PROXY_PORT, proxyPort);
    }

	public int getReadingTextSize() {
		return mPrefs.getInt(Name.READING_TEXT_SIZE, 2);
	}

    public void setReadingTextSize(int size) {
        putInt(Name.READING_TEXT_SIZE, 2);
    }

	public int getRenderingMode() {
		return mPrefs.getInt(Name.RENDERING_MODE, 0);
	}

    public void setRenderingMode(int mode) {
        putInt(Name.RENDERING_MODE, mode);
    }

	public boolean getRestoreLostTabsEnabled() {
		return mPrefs.getBoolean(Name.RESTORE_LOST_TABS, true);
	}

    public void setRestoreLostTabsEnabled(boolean enable) {
        putBoolean(Name.RESTORE_LOST_TABS, enable);
    }

	public String getSavedUrl() {
		return mPrefs.getString(Name.SAVE_URL, null);
	}

    public void setSavedUrl(String url) {
        putString(Name.SAVE_URL, url);
    }

	public boolean getSavePasswordsEnabled() {
		return mPrefs.getBoolean(Name.SAVE_PASSWORDS, true);
	}

    public void setSavePasswordsEnabled(boolean enable) {
        putBoolean(Name.SAVE_PASSWORDS, enable);
    }

	public int getSearchChoice() {
		return mPrefs.getInt(Name.SEARCH, 0);
	}

    public void setSearchChoice(int choice) {
        putInt(Name.SEARCH, choice);
    }

	public String getSearchUrl() {
		return mPrefs.getString(Name.SEARCH_URL, Constants.BAIDU_SEARCH);
	}

    public void setSearchUrl(String url) {
        putString(Name.SEARCH_URL, url);
    }

	public boolean getSyncHistoryEnabled() {
		return mPrefs.getBoolean(Name.SYNC_HISTORY, true);
	}

    public void setSyncHistoryEnabled(boolean enable) {
        putBoolean(Name.SYNC_HISTORY, enable);
    }

	public boolean getSystemBrowserPresent() {
		return mPrefs.getBoolean(Name.SYSTEM_BROWSER_PRESENT, false);
	}

    public void setSystemBrowserPresent(boolean available) {
        putBoolean(Name.SYSTEM_BROWSER_PRESENT, available);
    }

	public boolean getTextReflowEnabled() {
		return mPrefs.getBoolean(Name.TEXT_REFLOW, false);
	}

    public void setTextReflowEnabled(boolean enable) {
        putBoolean(Name.TEXT_REFLOW, enable);
    }

	public int getTextSize() {
		return mPrefs.getInt(Name.TEXT_SIZE, 3);
	}

    public void setTextSize(int size) {
        putInt(Name.TEXT_SIZE, size);
    }

	public int getUrlBoxContentChoice() {
		return mPrefs.getInt(Name.URL_BOX_CONTENTS, 0);
	}

    public void setUrlBoxContentChoice(int choice) {
        putInt(Name.URL_BOX_CONTENTS, choice);
    }

	public boolean getUseDarkTheme() {
		return mPrefs.getBoolean(Name.DARK_THEME, true);
	}

    public void setUseDarkTheme(boolean use) {
        putBoolean(Name.DARK_THEME, use);
    }

	public boolean getUseProxy() {
		return mPrefs.getBoolean(Name.USE_PROXY, false);
	}

	public int getProxyChoice() {
		return mPrefs.getInt(Name.PROXY_CHOICE, Constants.NO_PROXY);
	}

    /**
     * Valid choices:
     * <ul>
     * <li>{@link Constants#NO_PROXY}</li>
     * <li>{@link Constants#PROXY_ORBOT}</li>
     * <li>{@link Constants#PROXY_I2P}</li>
     * </ul>
     *
     * @param choice the proxy to use.
     */
    public void setProxyChoice(int choice) {
        putBoolean(Name.USE_PROXY, choice != Constants.NO_PROXY);
        putInt(Name.PROXY_CHOICE, choice);
    }

    public int getUserAgentChoice() {
        return mPrefs.getInt(Name.USER_AGENT, 1);
    }

    public void setUserAgentChoice(int choice) {
        putInt(Name.USER_AGENT, choice);
    }

	public String getUserAgentString(String def) {
		return mPrefs.getString(Name.USER_AGENT_STRING, def);
	}

    public boolean getUseWideViewportEnabled() {
        return mPrefs.getBoolean(Name.USE_WIDE_VIEWPORT, true);
    }

    public void setUseWideViewportEnabled(boolean enable) {
        putBoolean(Name.USE_WIDE_VIEWPORT, enable);
    }

	private void putBoolean(String name, boolean value) {
		mPrefs.edit().putBoolean(name, value).apply();
	}

	private void putInt(String name, int value) {
		mPrefs.edit().putInt(name, value).apply();
	}

	private void putString(String name, String value) {
		mPrefs.edit().putString(name, value).apply();
	}

    public int getSelectedIndex() {
        return mPrefs.getInt(Name.Tab_Selected, -1);

    }

    public void setSelectedIndex(int selectedIndex) {
        putInt(Name.Tab_Selected, selectedIndex);
    }

	public void setSelectedUrl(String url) {
		putString(Name.URL_Selected, url);
	}

	public void setUserAgentString(String agent) {
		putString(Name.USER_AGENT_STRING, agent);
    }

    private static class Name {
        public static final String ADOBE_FLASH_SUPPORT = "enableflash";
        public static final String BLOCK_ADS = "AdBlock";
        public static final String BLOCK_IMAGES = "blockimages";
        public static final String CLEAR_CACHE_EXIT = "cache";
        public static final String COOKIES = "cookies";
        public static final String DOWNLOAD_DIRECTORY = "download";
        public static final String FULL_SCREEN = "fullscreen";
        public static final String HIDE_STATUS_BAR = "hidestatus";
        public static final String HOMEPAGE = "home";
        public static final String INCOGNITO_COOKIES = "incognitocookies";
        public static final String JAVASCRIPT = "java";
        public static final String LOCATION = "location";
        public static final String OVERVIEW_MODE = "overviewmode";
        public static final String POPUPS = "newwindows";
        public static final String RESTORE_LOST_TABS = "restoreclosed";
        public static final String SAVE_PASSWORDS = "passwords";
        public static final String SEARCH = "search";
        public static final String SEARCH_URL = "searchurl";
        public static final String SYSTEM_BROWSER_PRESENT = "SystemBrowser";
        public static final String TEXT_REFLOW = "textreflow";
        public static final String TEXT_SIZE = "textsize";
        public static final String URL_MEMORY = "memory";
        public static final String URL_Selected = "selectedUrl";
        public static final String Tab_Selected = "tabselect";

        public static final String USE_WIDE_VIEWPORT = "wideviewport";
        public static final String USER_AGENT = "agentchoose";
        public static final String USER_AGENT_STRING = "userAgentString";
        public static final String GOOGLE_SEARCH_SUGGESTIONS = "GoogleSearchSuggestions";
        public static final String CLEAR_HISTORY_EXIT = "clearHistoryExit";
        public static final String CLEAR_COOKIES_EXIT = "clearCookiesExit";
        public static final String SAVE_URL = "saveUrl";
        public static final String RENDERING_MODE = "renderMode";
        public static final String SYNC_HISTORY = "syncHistory";
        public static final String BLOCK_THIRD_PARTY = "thirdParty";
        public static final String ENABLE_COLOR_MODE = "colorMode";
        public static final String URL_BOX_CONTENTS = "urlContent";
        public static final String INVERT_COLORS = "invertColors";
        public static final String READING_TEXT_SIZE = "readingTextSize";
        public static final String DARK_THEME = "darkTheme";
        public static final String DEFAULT_BOOKMARKS = "defaultBookmarks";

        public static final String USE_PROXY = "useProxy";
        public static final String PROXY_CHOICE = "proxyChoice";
        public static final String USE_PROXY_HOST = "useProxyHost";
        public static final String USE_PROXY_PORT = "useProxyPort";
        public static final String INITIAL_CHECK_FOR_TOR = "checkForTor";
        public static final String INITIAL_CHECK_FOR_I2P = "checkForI2P";
    }
}
