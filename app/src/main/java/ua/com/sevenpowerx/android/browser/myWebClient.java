package ua.com.sevenpowerx.android.browser;

import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by splaa notebook acer  on 15.12.2017.
 */

public class myWebClient extends WebViewClient {
    @SuppressWarnings("deprecation")
    @Override
    public boolean shouldOverrideUrlLoading(WebView view, String url) {
        view.loadUrl(url);
        return true;
    }
}
