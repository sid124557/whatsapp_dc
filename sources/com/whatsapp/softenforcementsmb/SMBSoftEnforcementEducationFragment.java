package com.whatsapp.softenforcementsmb;

import X.AnonymousClass001;
import X.AnonymousClass4JQ;
import X.AnonymousClass64B;
import X.C06560Yg;
import X.C18290x4;
import X.C25471aZ;
import X.C56612sH;
import X.C59952xl;
import X.C73343fL;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.R;
import com.whatsapp.RoundedBottomSheetDialogFragment;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class SMBSoftEnforcementEducationFragment extends RoundedBottomSheetDialogFragment implements AnonymousClass64B {
    public static final Map A06 = new C73343fL();
    public View A00;
    public ScrollView A01;
    public Integer A02 = C18290x4.A0a();
    public final Context A03;
    public final C56612sH A04;
    public final C59952xl A05;

    public void onDismiss(DialogInterface dialogInterface) {
        TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis() - 0);
        new C25471aZ();
        throw AnonymousClass001.A0g("source");
    }

    public SMBSoftEnforcementEducationFragment(Context context, C56612sH r3, C59952xl r4) {
        this.A03 = context;
        this.A05 = r4;
        this.A04 = r3;
    }

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View A0R = AnonymousClass001.A0R(layoutInflater, viewGroup, R.layout.f8nameremoved);
        A0R.findViewById(R.id.smb_soft_enforcement_education_intro);
        this.A01 = (ScrollView) C06560Yg.A02(A0R, R.id.smb_soft_enforcement_warning_scroller);
        this.A00 = C06560Yg.A02(A0R, R.id.smb_soft_enforcement_accept_button_container);
        throw AnonymousClass001.A0g(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ScrollView scrollView = this.A01;
        scrollView.getViewTreeObserver().addOnGlobalLayoutListener(new AnonymousClass4JQ(this.A00, scrollView, this, 2));
    }
}
