package X;

import android.app.Activity;
import android.app.Dialog;
import android.view.View;
import androidx.fragment.app.DialogFragment;
import com.whatsapp.payments.ui.PaymentWebViewActivity;
import com.whatsapp.wabloks.base.DefaultBkPreloadFragment$BkCustomReloadFragment;
import com.whatsapp.wabloks.base.GenericBkLayoutViewModelWithReload;
import com.whatsapp.webview.ui.WebViewLearnMoreBottomSheet;

/* renamed from: X.4Hs  reason: invalid class name and case insensitive filesystem */
public class C85814Hs implements View.OnClickListener {
    public Object A00;
    public final int A01;

    public C85814Hs(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public static void A00(View view, Object obj, int i) {
        view.setOnClickListener(new C85814Hs(obj, i));
    }

    public final void onClick(View view) {
        int i = this.A01;
        Object obj = this.A00;
        switch (i) {
            case 1:
                ((DialogFragment) obj).A1L();
                return;
            case 2:
            case 3:
                ((Activity) obj).finish();
                return;
            case 4:
                C162457s7.A0H(view);
                ((PaymentWebViewActivity) obj).navigationOnClick(view);
                return;
            case 7:
                GenericBkLayoutViewModelWithReload genericBkLayoutViewModelWithReload = ((DefaultBkPreloadFragment$BkCustomReloadFragment) obj).A01;
                if (genericBkLayoutViewModelWithReload != null) {
                    genericBkLayoutViewModelWithReload.A0G();
                    return;
                }
                throw C18270x1.A0S("viewModel");
            case 8:
                C08270df supportFragmentManager = ((C08310eF) obj).A0R().getSupportFragmentManager();
                WebViewLearnMoreBottomSheet webViewLearnMoreBottomSheet = new WebViewLearnMoreBottomSheet();
                if (supportFragmentManager.A0D("webview_learn_more") == null) {
                    webViewLearnMoreBottomSheet.A1O(supportFragmentManager, "webview_learn_more");
                    return;
                }
                return;
            default:
                ((Dialog) obj).show();
                return;
        }
    }
}
