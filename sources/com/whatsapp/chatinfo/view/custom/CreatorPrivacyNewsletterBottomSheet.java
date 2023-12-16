package com.whatsapp.chatinfo.view.custom;

import X.AnonymousClass0VX;
import X.AnonymousClass3ZH;
import X.AnonymousClass5YI;
import X.C003203q;
import X.C105365Uq;
import X.C112765kG;
import X.C114015mM;
import X.C162457s7;
import X.C18270x1;
import X.C18310x6;
import X.C56982ss;
import X.C86664Kz;
import X.C89654ea;
import X.C95804uY;
import android.os.Bundle;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;
import com.whatsapp.contact.photos.ContactPhotos$LoaderLifecycleEventObserver;

public class CreatorPrivacyNewsletterBottomSheet extends Hilt_CreatorPrivacyNewsletterBottomSheet {
    public WaImageView A00;
    public C105365Uq A01;
    public C114015mM A02;
    public C56982ss A03;
    public C112765kG A04;

    public void A0w(Bundle bundle, View view) {
        C95804uY r0;
        String string;
        C162457s7.A0J(view, 0);
        super.A0w(bundle, view);
        WaTextView waTextView = this.A03;
        if (waTextView != null) {
            C86664Kz.A1S(waTextView);
        }
        C003203q A0Q = A0Q();
        WaImageView waImageView = null;
        if ((A0Q instanceof C89654ea) && A0Q != null) {
            C114015mM r4 = this.A02;
            if (r4 != null) {
                C105365Uq A07 = r4.A07("newsletter-admin-privacy", C18310x6.A01(A0Q), AnonymousClass5YI.A04(A0Q, 24.0f));
                A0Q.A06.A00(new ContactPhotos$LoaderLifecycleEventObserver(A07));
                this.A01 = A07;
                WaImageView A11 = C86664Kz.A11(view, R.id.contact_photo);
                if (A11 != null) {
                    A11.setVisibility(0);
                    C112765kG r1 = this.A04;
                    if (r1 != null) {
                        r1.A00 = R.drawable.ic_channels_privacy_sheet_newsletter_avatar;
                        A11.setBackground(AnonymousClass0VX.A01(A0Q, R.drawable.white_circle));
                        A11.setClipToOutline(true);
                        C105365Uq r2 = this.A01;
                        if (r2 == null) {
                            throw C18270x1.A0S("contactPhotoLoader");
                        }
                        Bundle bundle2 = this.A06;
                        if (bundle2 == null || (string = bundle2.getString("jid")) == null) {
                            r0 = null;
                        } else {
                            r0 = C95804uY.A03.A01(string);
                        }
                        AnonymousClass3ZH r12 = new AnonymousClass3ZH(r0);
                        C112765kG r02 = this.A04;
                        if (r02 != null) {
                            r2.A05(A11, r02, r12, false);
                            waImageView = A11;
                        } else {
                            throw C18270x1.A0S("contactPhotoDisplayer");
                        }
                    } else {
                        throw C18270x1.A0S("contactPhotoDisplayer");
                    }
                }
                this.A00 = waImageView;
            } else {
                throw C18270x1.A0S("contactPhotos");
            }
        }
        PhoneNumberHiddenInNewsletterBottomSheet.A01(this.A00, R.drawable.ic_url);
        PhoneNumberHiddenInNewsletterBottomSheet.A01(this.A01, R.drawable.ic_hide);
        PhoneNumberHiddenInNewsletterBottomSheet.A01(this.A02, R.drawable.vec_ic_shield);
    }

    public void A0c() {
        super.A0c();
        this.A00 = null;
    }
}
