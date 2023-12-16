package com.whatsapp.newsletter.ui;

import X.AnonymousClass1RL;
import X.AnonymousClass2AB;
import X.AnonymousClass30V;
import X.AnonymousClass3ZH;
import X.AnonymousClass4SG;
import X.C005205m;
import X.C105365Uq;
import X.C107695bk;
import X.C114015mM;
import X.C141786w8;
import X.C18260x0;
import X.C18270x1;
import X.C64333Db;
import X.C73153f1;
import X.C86604Kt;
import X.C88834as;
import X.C96924xG;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.widget.ImageView;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.R;
import com.whatsapp.WaEditText;
import java.io.File;

public final class NewsletterEditActivity extends C96924xG {
    public C105365Uq A00;
    public C114015mM A01;
    public C141786w8 A02;
    public AnonymousClass30V A03;
    public boolean A04;

    public void A5r() {
        if (!this.A04) {
            this.A04 = true;
            C88834as A2W = AnonymousClass4SG.A2W(this);
            C64333Db r2 = A2W.A4Z;
            AnonymousClass4SG.A3W(r2, this);
            C107695bk r1 = r2.A00;
            AnonymousClass4SG.A3Q(r2, r1, this, AnonymousClass4SG.A2t(r2, r1, this));
            this.A08 = C64333Db.A39(r2);
            AnonymousClass4SG.A3O(A2W, r2, this);
            this.A01 = C64333Db.A29(r2);
            this.A03 = C86604Kt.A0f(r2);
        }
    }

    public void A66() {
        AnonymousClass30V r2 = this.A03;
        if (r2 != null) {
            r2.A03(this.A0B, 32);
            super.A66();
            return;
        }
        throw C18270x1.A0S("navigationTimeSpentManager");
    }

    public boolean A6C() {
        return true;
    }

    public File A78() {
        int ordinal = this.A02.ordinal();
        if (ordinal == 0) {
            return null;
        }
        if (ordinal == 2) {
            return super.A78();
        }
        if (ordinal == 1) {
            return null;
        }
        throw C73153f1.A00();
    }

    public boolean A7H() {
        String str;
        int ordinal = this.A02.ordinal();
        if (ordinal == 0) {
            AnonymousClass1RL A76 = A76();
            if (A76 == null || (str = A76.A0J) == null || str.length() == 0) {
                return false;
            }
            return true;
        } else if (ordinal == 2) {
            return super.A7H();
        } else {
            if (ordinal == 1) {
                return false;
            }
            throw C73153f1.A00();
        }
    }

    public NewsletterEditActivity(int i) {
        this.A04 = false;
        C86604Kt.A1K(this, 68);
    }

    public void A7A() {
        super.A7A();
        this.A02 = C141786w8.UPDATED;
    }

    public void A7B() {
        super.A7B();
        this.A02 = C141786w8.UPDATED;
    }

    public void A7C() {
        super.A7C();
        this.A02 = C141786w8.DELETED;
    }

    public void A7E() {
        super.A7E();
        C005205m.A01(this, R.id.newsletter_save_button).setText(R.string.f11nameremoved);
    }

    public void onCreate(Bundle bundle) {
        String str;
        String str2;
        String A002;
        super.onCreate(bundle);
        C114015mM r1 = this.A01;
        if (r1 != null) {
            this.A00 = r1.A04(this, this, "newsletter-edit");
            if (this.A0B == null) {
                finish();
            } else {
                AnonymousClass1RL A76 = A76();
                if (A76 != null) {
                    WaEditText A75 = A75();
                    String str3 = A76.A0H;
                    String str4 = "";
                    if (str3 == null || (str = AnonymousClass2AB.A00(str3)) == null) {
                        str = str4;
                    }
                    A75.setText(str);
                    WaEditText A74 = A74();
                    String str5 = A76.A0E;
                    if (!(str5 == null || (A002 = AnonymousClass2AB.A00(str5)) == null)) {
                        str4 = A002;
                    }
                    A74.setText(str4);
                    int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
                    C105365Uq r3 = this.A00;
                    if (r3 == null) {
                        throw C18270x1.A0S("contactPhotoLoader");
                    }
                    AnonymousClass3ZH r2 = new AnonymousClass3ZH(this.A0B);
                    AnonymousClass1RL A762 = A76();
                    if (!(A762 == null || (str2 = A762.A0H) == null)) {
                        r2.A0P = str2;
                    }
                    ImageView imageView = this.A00;
                    if (imageView != null) {
                        r3.A09(imageView, r2, dimensionPixelSize, true);
                    } else {
                        throw C18270x1.A0S(PublicKeyCredentialControllerUtility.JSON_KEY_ICON);
                    }
                }
            }
            if (bundle != null) {
                this.A02 = C141786w8.values()[bundle.getInt("photo_state", 0)];
                return;
            }
            return;
        }
        throw C18270x1.A0S("contactPhotos");
    }

    public void onSaveInstanceState(Bundle bundle, PersistableBundle persistableBundle) {
        C18260x0.A0O(bundle, persistableBundle);
        super.onSaveInstanceState(bundle, persistableBundle);
        bundle.putInt("photo_state", this.A02.ordinal());
    }

    public NewsletterEditActivity() {
        this(0);
        this.A02 = C141786w8.UNCHANGED;
    }
}
