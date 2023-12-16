package X;

import android.graphics.Bitmap;
import android.net.Uri;
import android.view.MenuItem;
import android.widget.ImageView;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.R;
import com.whatsapp.WaEditText;
import com.whatsapp.newsletter.ui.NewsletterCreationActivity;
import com.whatsapp.newsletter.ui.NewsletterEditActivity;
import com.whatsapp.newsletter.ui.NewsletterEditDescriptionActivity;
import java.io.File;

/* renamed from: X.4xG  reason: invalid class name and case insensitive filesystem */
public abstract class C96924xG extends C131816eE {
    public ImageView A00;
    public C100995Db A01;
    public C101005Dc A02;
    public C44142Uv A03;
    public WaEditText A04;
    public WaEditText A05;
    public C56332ro A06;
    public C613330g A07;
    public C56982ss A08;
    public AnonymousClass3ZH A09;
    public C59862xc A0A;
    public C95804uY A0B;
    public AnonymousClass31C A0C;
    public C56842se A0D;
    public AnonymousClass5YD A0E;
    public C30181m2 A0F;
    public C60152y5 A0G;
    public C989053r A0H;
    public String A0I;
    public String A0J;

    public void A7A() {
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
        C613330g r1 = this.A07;
        if (r1 != null) {
            AnonymousClass3ZH r3 = this.A09;
            if (r3 == null) {
                throw C18270x1.A0S("tempContact");
            }
            Bitmap A032 = r1.A03(this, r3, 0.0f, dimensionPixelSize, false);
            if (A032 != null) {
                ImageView imageView = this.A00;
                if (imageView != null) {
                    C59862xc r32 = this.A0A;
                    if (r32 != null) {
                        imageView.setImageDrawable(r32.A01(getResources(), A032, new AnonymousClass922(3)));
                        return;
                    }
                    throw C18270x1.A0S("pathDrawableHelper");
                }
                throw C18270x1.A0S(PublicKeyCredentialControllerUtility.JSON_KEY_ICON);
            }
            return;
        }
        throw C18270x1.A0S("contactBitmapManager");
    }

    public void A7B() {
        C30181m2 r1 = this.A0F;
        if (r1 == null) {
            throw C18270x1.A0S("photoUpdater");
        }
        AnonymousClass3ZH r0 = this.A09;
        if (r0 == null) {
            throw C18270x1.A0S("tempContact");
        }
        r1.A03(r0).delete();
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
        C613330g r5 = this.A07;
        if (r5 != null) {
            AnonymousClass3ZH r7 = this.A09;
            if (r7 == null) {
                throw C18270x1.A0S("tempContact");
            }
            Bitmap A032 = r5.A03(this, r7, 0.0f, dimensionPixelSize, false);
            if (A032 != null) {
                ImageView imageView = this.A00;
                if (imageView != null) {
                    C59862xc r3 = this.A0A;
                    if (r3 != null) {
                        imageView.setImageDrawable(r3.A01(getResources(), A032, new AnonymousClass922(4)));
                        return;
                    }
                    throw C18270x1.A0S("pathDrawableHelper");
                }
                throw C18270x1.A0S(PublicKeyCredentialControllerUtility.JSON_KEY_ICON);
            }
            return;
        }
        throw C18270x1.A0S("contactBitmapManager");
    }

    public final WaEditText A74() {
        WaEditText waEditText = this.A04;
        if (waEditText != null) {
            return waEditText;
        }
        throw C18270x1.A0S("descriptionEditText");
    }

    public final WaEditText A75() {
        WaEditText waEditText = this.A05;
        if (waEditText != null) {
            return waEditText;
        }
        throw C18270x1.A0S("nameEditText");
    }

    public final AnonymousClass1RL A76() {
        C95804uY r1 = this.A0B;
        if (r1 != null) {
            C56982ss r0 = this.A08;
            if (r0 != null) {
                AnonymousClass31A A002 = C56982ss.A00(r0, r1);
                if (A002 instanceof AnonymousClass1RL) {
                    return (AnonymousClass1RL) A002;
                }
            } else {
                throw C18270x1.A0S("chatsCache");
            }
        }
        return null;
    }

    public final AnonymousClass5YD A77() {
        AnonymousClass5YD r0 = this.A0E;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("newsletterLogging");
    }

    public File A78() {
        Uri fromFile;
        C56332ro r1 = this.A06;
        if (r1 != null) {
            AnonymousClass3ZH r0 = this.A09;
            if (r0 == null) {
                throw C18270x1.A0S("tempContact");
            }
            File A002 = r1.A00(r0);
            if (A002 == null || !A002.exists() || (fromFile = Uri.fromFile(A002)) == null) {
                return null;
            }
            C989053r r02 = this.A0H;
            if (r02 != null) {
                return r02.A0E(fromFile);
            }
            throw C18270x1.A0S("mediaFileUtils");
        }
        throw C18270x1.A0S("contactPhotoHelper");
    }

    public void A7C() {
        C56332ro r1 = this.A06;
        if (r1 != null) {
            AnonymousClass3ZH r0 = this.A09;
            if (r0 == null) {
                throw C18270x1.A0S("tempContact");
            }
            File A002 = r1.A00(r0);
            if (A002 != null) {
                A002.delete();
            }
            ImageView imageView = this.A00;
            if (imageView != null) {
                C59862xc r5 = this.A0A;
                if (r5 != null) {
                    imageView.setImageDrawable(C59862xc.A00(getTheme(), getResources(), new AnonymousClass922(2), r5.A00, R.drawable.avatar_newsletter_large));
                    return;
                }
                throw C18270x1.A0S("pathDrawableHelper");
            }
            throw C18270x1.A0S(PublicKeyCredentialControllerUtility.JSON_KEY_ICON);
        }
        throw C18270x1.A0S("contactPhotoHelper");
    }

    public void A7D() {
        byte[] bArr;
        byte[] bArr2;
        String str;
        String str2;
        String str3;
        String str4;
        if (this instanceof NewsletterEditDescriptionActivity) {
            AnonymousClass31C r0 = this.A0C;
            if (r0 == null) {
                throw C18270x1.A0S("messageClient");
            } else if (r0.A0I()) {
                A7F();
                String A79 = A79();
                String A002 = AnonymousClass2AB.A00(C86644Kx.A0g(A75()));
                C95804uY r2 = this.A0B;
                if (r2 != null) {
                    Bp9(R.string.f11nameremoved);
                    AnonymousClass1RL A76 = A76();
                    if (A76 != null) {
                        str3 = A76.A0E;
                    } else {
                        str3 = null;
                    }
                    boolean z = !C162457s7.A0P(A79, str3);
                    C56842se r1 = this.A0D;
                    if (r1 != null) {
                        AnonymousClass1RL A762 = A76();
                        if (A762 != null) {
                            str4 = A762.A0H;
                        } else {
                            str4 = null;
                        }
                        if (C162457s7.A0P(A002, str4)) {
                            A002 = null;
                        }
                        if (!z) {
                            A79 = null;
                        }
                        r1.A0B(r2, new C124196Bi(this, 3), A002, A79, (byte[]) null, z, false);
                        return;
                    }
                    throw C18270x1.A0S("newsletterManager");
                }
                return;
            }
        } else if (this instanceof NewsletterEditActivity) {
            NewsletterEditActivity newsletterEditActivity = (NewsletterEditActivity) this;
            AnonymousClass31C r02 = newsletterEditActivity.A0C;
            if (r02 == null) {
                throw C18270x1.A0S("messageClient");
            } else if (!r02.A0I()) {
                newsletterEditActivity.A7G();
                return;
            } else {
                newsletterEditActivity.A7F();
                String A792 = newsletterEditActivity.A79();
                String A003 = AnonymousClass2AB.A00(C86644Kx.A0g(newsletterEditActivity.A75()));
                File A78 = newsletterEditActivity.A78();
                if (A78 != null) {
                    bArr2 = C627536m.A0U(A78);
                } else {
                    bArr2 = null;
                }
                C95804uY r4 = newsletterEditActivity.A0B;
                if (r4 != null) {
                    newsletterEditActivity.Bp9(R.string.f11nameremoved);
                    AnonymousClass1RL A763 = newsletterEditActivity.A76();
                    if (A763 != null) {
                        str = A763.A0E;
                    } else {
                        str = null;
                    }
                    boolean z2 = !C162457s7.A0P(A792, str);
                    C56842se r3 = newsletterEditActivity.A0D;
                    if (r3 != null) {
                        AnonymousClass1RL A764 = newsletterEditActivity.A76();
                        if (A764 != null) {
                            str2 = A764.A0H;
                        } else {
                            str2 = null;
                        }
                        if (C162457s7.A0P(A003, str2)) {
                            A003 = null;
                        }
                        if (!z2) {
                            A792 = null;
                        }
                        r3.A0B(r4, new C124196Bi(newsletterEditActivity, 2), A003, A792, bArr2, z2, C18300x5.A1W(newsletterEditActivity.A02, C141786w8.UNCHANGED));
                        return;
                    }
                    throw C18270x1.A0S("newsletterManager");
                }
                return;
            }
        } else {
            AnonymousClass31C r03 = this.A0C;
            if (r03 == null) {
                throw C18270x1.A0S("messageClient");
            } else if (r03.A0I()) {
                A7F();
                Bp9(R.string.f11nameremoved);
                C56842se r12 = this.A0D;
                if (r12 != null) {
                    String A004 = AnonymousClass2AB.A00(C86644Kx.A0g(A75()));
                    String A793 = A79();
                    File A782 = A78();
                    if (A782 != null) {
                        bArr = C627536m.A0U(A782);
                    } else {
                        bArr = null;
                    }
                    C124196Bi r42 = new C124196Bi(this, 1);
                    C162457s7.A0J(A004, 0);
                    if (C18300x5.A1S(r12.A0E)) {
                        C39822Dl r13 = r12.A00;
                        if (r13 != null) {
                            AnonymousClass4FS A8y = C64333Db.A8y(r13.A00.A01);
                            C64333Db r14 = r13.A00.A01;
                            new AnonymousClass1h2((C56652sL) r14.AOJ.get(), r14.Anh(), r42, (AnonymousClass48L) r14.AOH.get(), r14.AoV(), A8y, A004, A793, bArr).A00();
                            return;
                        }
                        throw C18270x1.A0S("createNewsletterGraphQlHandler");
                    }
                    return;
                }
                throw C18270x1.A0S("newsletterManager");
            }
        }
        A7G();
    }

    public final void A7F() {
        int i;
        boolean z = this instanceof NewsletterCreationActivity;
        A77().A05(12, z);
        if (A75().hasFocus()) {
            String str = this.A0J;
            if (str == null) {
                throw C18270x1.A0S("tempNameText");
            } else if (!str.equals(C86644Kx.A0g(A75()))) {
                i = 6;
                A77().A05(i, z);
            }
        }
        if (A74().hasFocus()) {
            String str2 = this.A0I;
            if (str2 == null) {
                throw C18270x1.A0S("tempDescriptionText");
            } else if (!str2.equals(C86644Kx.A0g(A74()))) {
                i = 11;
                A77().A05(i, z);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x007c, code lost:
        if (r1 != 2) goto L_0x007e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onActivityResult(int r10, int r11, android.content.Intent r12) {
        /*
            r9 = this;
            r0 = 2001(0x7d1, float:2.804E-42)
            r3 = -1
            r5 = r9
            r4 = r12
            if (r10 == r0) goto L_0x003f
            r0 = 2002(0x7d2, float:2.805E-42)
            if (r10 == r0) goto L_0x0013
            android.content.Intent r0 = r9.getIntent()
            super.onActivityResult(r10, r11, r0)
        L_0x0012:
            return
        L_0x0013:
            X.1m2 r2 = r9.A0F
            java.lang.String r1 = "photoUpdater"
            if (r2 != 0) goto L_0x001e
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r1)
            throw r0
        L_0x001e:
            X.3ZH r0 = r9.A09
            if (r0 != 0) goto L_0x0029
            java.lang.String r0 = "tempContact"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0029:
            java.io.File r0 = r2.A03(r0)
            r0.delete()
            if (r11 == r3) goto L_0x0087
            if (r11 != 0) goto L_0x0012
            if (r12 == 0) goto L_0x0012
            X.1m2 r0 = r9.A0F
            if (r0 != 0) goto L_0x0083
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r1)
            throw r0
        L_0x003f:
            if (r11 != r3) goto L_0x0012
            if (r12 == 0) goto L_0x0097
            r0 = 0
            java.lang.String r3 = "is_reset"
            boolean r0 = r12.getBooleanExtra(r3, r0)
            if (r0 != 0) goto L_0x005f
            java.lang.String r0 = "emojiEditorImageResult"
            boolean r0 = r12.hasExtra(r0)
            if (r0 == 0) goto L_0x006a
            r2 = 9
        L_0x0056:
            X.5YD r1 = r9.A77()
            boolean r0 = r9 instanceof com.whatsapp.newsletter.ui.NewsletterCreationActivity
            r1.A05(r2, r0)
        L_0x005f:
            r1 = 0
            boolean r0 = r12.getBooleanExtra(r3, r1)
            if (r0 == 0) goto L_0x008b
            r9.A7C()
            return
        L_0x006a:
            java.lang.String r1 = "photo_source"
            boolean r0 = r12.hasExtra(r1)
            if (r0 == 0) goto L_0x007e
            int r1 = X.C18320x8.A01(r12, r1)
            r0 = 1
            if (r1 == r0) goto L_0x0081
            r0 = 2
            r2 = 8
            if (r1 == r0) goto L_0x0056
        L_0x007e:
            r2 = 10
            goto L_0x0056
        L_0x0081:
            r2 = 7
            goto L_0x0056
        L_0x0083:
            r0.A04(r12, r9)
            return
        L_0x0087:
            r9.A7A()
            return
        L_0x008b:
            java.lang.String r0 = "skip_cropping"
            boolean r0 = r12.getBooleanExtra(r0, r1)
            if (r0 == 0) goto L_0x0097
            r9.A7B()
            return
        L_0x0097:
            X.1m2 r3 = r9.A0F
            if (r3 != 0) goto L_0x00a2
            java.lang.String r0 = "photoUpdater"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x00a2:
            X.3ZH r7 = r9.A09
            if (r7 != 0) goto L_0x00ad
            java.lang.String r0 = "tempContact"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x00ad:
            r8 = 2002(0x7d2, float:2.805E-42)
            r6 = r9
            r3.A06(r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C96924xG.onActivityResult(int, int, android.content.Intent):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x01da  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r27) {
        /*
            r26 = this;
            r0 = r26
            r1 = r27
            super.onCreate(r1)
            X.5Yx r2 = X.C95804uY.A03
            java.lang.String r1 = X.AnonymousClass0x7.A0l(r0)
            X.4uY r1 = r2.A01(r1)
            r0.A0B = r1
            r1 = 2131624048(0x7f0e0070, float:1.8875265E38)
            r0.setContentView((int) r1)
            X.2sr r1 = r0.A01
            com.whatsapp.jid.PhoneUserJid r1 = X.C56972sr.A05(r1)
            java.lang.String r1 = r1.user
            java.lang.StringBuilder r5 = X.AnonymousClass000.A0l(r1)
            r1 = 45
            r5.append(r1)
            java.lang.String r4 = X.C86604Kt.A0k()
            java.lang.String r3 = "-"
            java.lang.String r2 = ""
            r1 = 0
            java.lang.String r1 = X.C175738Zn.A0U(r4, r3, r2, r1)
            java.lang.String r3 = X.AnonymousClass000.A0X(r1, r5)
            java.lang.String r2 = "newsletter"
            r1 = 0
            X.C162457s7.A0J(r3, r1)
            X.34X r1 = X.C95804uY.A02
            X.4uY r3 = r1.A03(r3, r2)
            X.C162457s7.A0D(r3)
            r1 = 1
            r3.A00 = r1
            X.3ZH r2 = new X.3ZH
            r2.<init>(r3)
            r1 = 2131895792(0x7f1225f0, float:1.9426427E38)
            java.lang.String r1 = r0.getString(r1)
            r2.A0P = r1
            r0.A09 = r2
            r1 = 2131430651(0x7f0b0cfb, float:1.848301E38)
            android.view.View r1 = X.C18290x4.A0L(r0, r1)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r2 = 0
            X.C162457s7.A0J(r1, r2)
            r0.A00 = r1
            r1 = 2131431771(0x7f0b115b, float:1.848528E38)
            android.view.View r1 = X.C18290x4.A0L(r0, r1)
            com.whatsapp.WaEditText r1 = (com.whatsapp.WaEditText) r1
            X.C162457s7.A0J(r1, r2)
            r0.A05 = r1
            r1 = 2131431725(0x7f0b112d, float:1.8485187E38)
            android.view.View r1 = X.C18290x4.A0L(r0, r1)
            com.whatsapp.WaEditText r1 = (com.whatsapp.WaEditText) r1
            X.C162457s7.A0J(r1, r2)
            r0.A04 = r1
            androidx.appcompat.widget.Toolbar r1 = X.AnonymousClass1Hf.A28(r0)
            r0.setSupportActionBar(r1)
            boolean r1 = r0 instanceof com.whatsapp.newsletter.ui.NewsletterEditDescriptionActivity
            if (r1 != 0) goto L_0x01b3
            boolean r1 = r0 instanceof com.whatsapp.newsletter.ui.NewsletterEditActivity
            if (r1 != 0) goto L_0x01b3
            X.0R8 r2 = r0.getSupportActionBar()
            if (r2 == 0) goto L_0x00aa
            r1 = 1
            r2.A0Q(r1)
            r2.A0N(r1)
            r1 = 2131895792(0x7f1225f0, float:1.9426427E38)
        L_0x00a7:
            r2.A0B(r1)
        L_0x00aa:
            android.widget.ImageView r2 = r0.A00
            if (r2 == 0) goto L_0x01da
            r1 = 28
            X.C18300x5.A19(r2, r0, r1)
            r1 = 2131431771(0x7f0b115b, float:1.848528E38)
            android.view.View r2 = X.C18290x4.A0L(r0, r1)
            com.whatsapp.WaEditText r2 = (com.whatsapp.WaEditText) r2
            r1 = 0
            X.C162457s7.A0J(r2, r1)
            r0.A05 = r2
            com.whatsapp.WaEditText r3 = r0.A75()
            r1 = 1
            android.text.InputFilter[] r2 = new android.text.InputFilter[r1]
            r1 = 100
            X.C109095e4.A00(r3, r2, r1)
            r1 = 2131431649(0x7f0b10e1, float:1.8485033E38)
            android.view.View r5 = X.C18290x4.A0L(r0, r1)
            android.widget.TextView r5 = (android.widget.TextView) r5
            com.whatsapp.WaEditText r2 = r0.A75()
            X.5Db r1 = r0.A01
            if (r1 == 0) goto L_0x01d3
            com.whatsapp.WaEditText r4 = r0.A75()
            X.5sx r1 = r1.A00
            X.3Db r1 = r1.A03
            X.5Y0 r9 = X.C64333Db.A3o(r1)
            X.33i r6 = X.C64333Db.A2o(r1)
            X.33j r7 = X.C64333Db.A2t(r1)
            X.2y5 r10 = X.C64333Db.A74(r1)
            X.5bk r1 = r1.A00
            X.487 r8 = X.C107695bk.A1l(r1)
            r11 = 100
            r12 = 0
            X.52T r3 = new X.52T
            r14 = r12
            r15 = r12
            r13 = r12
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r2.addTextChangedListener(r3)
            com.whatsapp.WaEditText r2 = r0.A75()
            r1 = 4
            X.AnonymousClass695.A00(r2, r0, r1)
            r1 = 2131431655(0x7f0b10e7, float:1.8485045E38)
            android.view.View r2 = X.C18290x4.A0L(r0, r1)
            com.google.android.material.textfield.TextInputLayout r2 = (com.google.android.material.textfield.TextInputLayout) r2
            r1 = 2131891100(0x7f12139c, float:1.941691E38)
            java.lang.String r1 = r0.getString(r1)
            r2.setHint((java.lang.CharSequence) r1)
            r1 = 2131431725(0x7f0b112d, float:1.8485187E38)
            android.view.View r1 = X.C18290x4.A0L(r0, r1)
            com.whatsapp.WaEditText r1 = (com.whatsapp.WaEditText) r1
            X.C162457s7.A0J(r1, r12)
            r0.A04 = r1
            r1 = 2131429413(0x7f0b0825, float:1.8480498E38)
            X.C86604Kt.A1L(r0, r1)
            com.whatsapp.WaEditText r2 = r0.A74()
            r1 = 2131891012(0x7f121344, float:1.9416732E38)
            r2.setHint(r1)
            r1 = 2131429411(0x7f0b0823, float:1.8480494E38)
            android.view.View r15 = X.C005205m.A00(r0, r1)
            java.lang.String r1 = "null cannot be cast to non-null type android.widget.TextView"
            X.C162457s7.A0K(r15, r1)
            android.widget.TextView r15 = (android.widget.TextView) r15
            r15.setVisibility(r12)
            X.5Dc r1 = r0.A02
            if (r1 == 0) goto L_0x01cc
            com.whatsapp.WaEditText r14 = r0.A74()
            r3 = 2048(0x800, float:2.87E-42)
            r4 = 1
            X.5sx r1 = r1.A00
            X.3Db r1 = r1.A03
            X.5Y0 r19 = X.C64333Db.A3o(r1)
            X.33i r16 = X.C64333Db.A2o(r1)
            X.33j r17 = X.C64333Db.A2t(r1)
            X.2y5 r20 = X.C64333Db.A74(r1)
            X.5bk r1 = r1.A00
            X.487 r18 = X.C107695bk.A1l(r1)
            X.52T r13 = new X.52T
            r22 = r3
            r25 = r12
            r21 = r3
            r23 = r4
            r24 = r12
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            com.whatsapp.WaEditText r1 = r0.A74()
            r1.addTextChangedListener(r13)
            com.whatsapp.WaEditText r2 = r0.A74()
            X.5e4[] r1 = new X.C109095e4[r4]
            X.C109095e4.A00(r2, r1, r3)
            com.whatsapp.WaEditText r2 = r0.A74()
            r1 = 5
            X.AnonymousClass695.A00(r2, r0, r1)
            r0.A7E()
            boolean r2 = r0.A7H()
            X.2Uv r1 = r0.A03
            if (r1 == 0) goto L_0x01c5
            X.1m2 r1 = r1.A00(r2)
            r0.A0F = r1
            return
        L_0x01b3:
            X.0R8 r2 = r0.getSupportActionBar()
            if (r2 == 0) goto L_0x00aa
            r1 = 1
            r2.A0Q(r1)
            r2.A0N(r1)
            r1 = 2131888808(0x7f120aa8, float:1.9412262E38)
            goto L_0x00a7
        L_0x01c5:
            java.lang.String r0 = "photoUpdaterFactory"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x01cc:
            java.lang.String r0 = "formattedTextWatcherFactory"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x01d3:
            java.lang.String r0 = "limitingTextFactory"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x01da:
            java.lang.String r0 = "icon"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C96924xG.onCreate(android.os.Bundle):void");
    }

    public final String A79() {
        String A002 = AnonymousClass2AB.A00(C86644Kx.A0g(A74()));
        if (C175738Zn.A0V(A002)) {
            return null;
        }
        return A002;
    }

    public void A7E() {
        C989653x.A00(C18290x4.A0L(this, R.id.newsletter_save_button), this, 16);
    }

    public final void A7G() {
        C19340zH A002 = AnonymousClass5V0.A00(this);
        A002.A0U(R.string.f11nameremoved);
        A002.A0T(R.string.f11nameremoved);
        A002.A0d(this, AnonymousClass4L0.A0G(this, 286), R.string.f11nameremoved);
        A002.A0c(this, new C1897592n(3), R.string.f11nameremoved);
        C18280x3.A0q(A002);
    }

    public boolean A7H() {
        File A78 = A78();
        if (A78 != null) {
            return A78.exists();
        }
        return false;
    }

    public void onDestroy() {
        super.onDestroy();
        AnonymousClass5YD A77 = A77();
        A77.A00 = 0;
        A77.A01 = 0;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (C18290x4.A04(menuItem) != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }
}
