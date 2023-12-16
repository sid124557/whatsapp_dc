package com.whatsapp.dialogs;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass1VX;
import X.AnonymousClass5X8;
import X.C107635bd;
import X.C111095hX;
import X.C162457s7;
import X.C18270x1;
import X.C18280x3;
import X.C18300x5;
import X.C19340zH;
import X.C620633i;
import X.C633839a;
import X.C69263Wi;
import android.app.Dialog;
import android.content.Context;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import java.util.HashMap;

public final class UnrecoverableErrorDialogFragment extends Hilt_UnrecoverableErrorDialogFragment {
    public static final String A04;
    public C111095hX A00;
    public C69263Wi A01;
    public AnonymousClass5X8 A02;
    public C620633i A03;

    public Dialog A1J(Bundle bundle) {
        View A0R = AnonymousClass001.A0R(LayoutInflater.from(A0G()), (ViewGroup) null, R.layout.f8nameremoved);
        HashMap A0t = AnonymousClass001.A0t();
        AnonymousClass5X8 r1 = this.A02;
        if (r1 != null) {
            Uri A002 = r1.A00("https://faq.whatsapp.com/807139050546238/");
            C162457s7.A0D(A002);
            A0t.put("uninstall-whatsapp", A002);
            TextEmojiLabel textEmojiLabel = (TextEmojiLabel) C18280x3.A0E(A0R, R.id.dialog_message_uninstall_wa);
            TextEmojiLabel textEmojiLabel2 = (TextEmojiLabel) C18280x3.A0E(A0R, R.id.dialog_message_install_wa);
            AnonymousClass5X8 r0 = this.A02;
            if (r0 != null) {
                String str = A04;
                Uri A003 = r0.A00(str);
                C162457s7.A0D(A003);
                A0t.put("install-whatsapp-playstore", A003);
                AnonymousClass5X8 r5 = this.A02;
                if (r5 != null) {
                    Uri A004 = r5.A00("https://whatsapp.com/android/");
                    C162457s7.A0D(A004);
                    A0t.put("install-whatsapp-website", A004);
                    Context context = A0R.getContext();
                    AnonymousClass1VX r11 = this.A02;
                    C69263Wi r8 = this.A01;
                    if (r8 != null) {
                        C111095hX r7 = this.A00;
                        if (r7 != null) {
                            C620633i r10 = this.A03;
                            if (r10 != null) {
                                C107635bd.A0G(context, r7, r8, textEmojiLabel, r10, r11, A0R.getContext().getString(R.string.f11nameremoved), A0t);
                                Context context2 = A0R.getContext();
                                AnonymousClass1VX r72 = this.A02;
                                C69263Wi r6 = this.A01;
                                if (r6 != null) {
                                    C111095hX r12 = this.A00;
                                    if (r12 != null) {
                                        C620633i r52 = this.A03;
                                        if (r52 != null) {
                                            boolean z = false;
                                            try {
                                                PackageManager packageManager = A0G().getPackageManager();
                                                packageManager.getPackageInfo("com.android.vending", 0);
                                                if (C18300x5.A08(str).resolveActivity(packageManager) != null) {
                                                    z = true;
                                                }
                                            } catch (PackageManager.NameNotFoundException unused) {
                                            }
                                            Context context3 = A0R.getContext();
                                            int i = R.string.f11nameremoved;
                                            if (z) {
                                                i = R.string.f11nameremoved;
                                            }
                                            HashMap hashMap = A0t;
                                            C69263Wi r13 = r6;
                                            C107635bd.A0G(context2, r12, r13, textEmojiLabel2, r52, r72, context3.getString(i), hashMap);
                                            C633839a.A00(C18280x3.A0E(A0R, R.id.ok_button), this, 3);
                                            C19340zH A0M = C18300x5.A0M(this);
                                            A0M.A0a(A0R);
                                            return C18300x5.A0H(A0M);
                                        }
                                        throw C18270x1.A0S("systemServices");
                                    }
                                    throw C18270x1.A0S("activityUtils");
                                }
                                throw C18270x1.A0S("globalUI");
                            }
                            throw C18270x1.A0S("systemServices");
                        }
                        throw C18270x1.A0S("activityUtils");
                    }
                    throw C18270x1.A0S("globalUI");
                }
                throw C18270x1.A0S("waLinkFactory");
            }
            throw C18270x1.A0S("waLinkFactory");
        }
        throw C18270x1.A0S("waLinkFactory");
    }

    static {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("market://details?id=");
        A04 = AnonymousClass000.A0X("com.whatsapp", A0o);
    }
}
