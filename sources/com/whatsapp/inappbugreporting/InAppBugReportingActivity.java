package com.whatsapp.inappbugreporting;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass0R8;
import X.AnonymousClass0x2;
import X.AnonymousClass0x9;
import X.AnonymousClass1Ha;
import X.AnonymousClass2AB;
import X.AnonymousClass2SK;
import X.AnonymousClass2WS;
import X.AnonymousClass39J;
import X.AnonymousClass42Y;
import X.AnonymousClass490;
import X.AnonymousClass4FV;
import X.AnonymousClass4L0;
import X.AnonymousClass4Rx;
import X.AnonymousClass4SG;
import X.AnonymousClass5OS;
import X.AnonymousClass5UY;
import X.AnonymousClass5WY;
import X.AnonymousClass5Yj;
import X.AnonymousClass5ZR;
import X.AnonymousClass66R;
import X.AnonymousClass68H;
import X.AnonymousClass8HQ;
import X.AnonymousClass8WN;
import X.AnonymousClass8YD;
import X.C005205m;
import X.C1000259c;
import X.C1001459r;
import X.C106695a0;
import X.C106715a2;
import X.C107085af;
import X.C107655bf;
import X.C107695bk;
import X.C109695f2;
import X.C1216361h;
import X.C1216461i;
import X.C1216561j;
import X.C1216661k;
import X.C1216761l;
import X.C134736jX;
import X.C154517dI;
import X.C162457s7;
import X.C175738Zn;
import X.C18260x0;
import X.C18270x1;
import X.C18280x3;
import X.C18290x4;
import X.C27991fJ;
import X.C47362d8;
import X.C53602nM;
import X.C631938h;
import X.C635439q;
import X.C64333Db;
import X.C67423Pf;
import X.C70003Zm;
import X.C86604Kt;
import X.C86614Ku;
import X.C86624Kv;
import X.C86644Kx;
import X.C86664Kz;
import X.C89644eZ;
import X.C989053r;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewStub;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaEditText;
import com.whatsapp.WaTextView;
import com.whatsapp.nativelibloader.WhatsAppLibLoader;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.Voip;
import com.whatsapp.wds.components.button.WDSButton;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;

public class InAppBugReportingActivity extends C89644eZ implements AnonymousClass490 {
    public ProgressDialog A00;
    public View A01;
    public ViewStub A02;
    public LinearLayout A03;
    public TextView A04;
    public ConstraintLayout A05;
    public ConstraintLayout A06;
    public AnonymousClass5WY A07;
    public TextEmojiLabel A08;
    public WaEditText A09;
    public WaEditText A0A;
    public WaTextView A0B;
    public WaTextView A0C;
    public C53602nM A0D;
    public AnonymousClass5ZR A0E;
    public AnonymousClass4FV A0F;
    public AnonymousClass2WS A0G;
    public C106695a0 A0H;
    public WhatsAppLibLoader A0I;
    public C47362d8 A0J;
    public C106715a2 A0K;
    public AnonymousClass5UY A0L;
    public WDSButton A0M;
    public String A0N;
    public boolean A0O;
    public Uri[] A0P;
    public final AnonymousClass66R A0Q;

    public final void A76() {
        if (this.A07 != null) {
            C47362d8 r4 = this.A0J;
            if (r4 != null) {
                String A75 = A75();
                Uri[] uriArr = this.A0P;
                ArrayList A0s = AnonymousClass001.A0s();
                for (Uri uri : uriArr) {
                    if (uri != null) {
                        A0s.add(uri);
                    }
                }
                r4.A00(this, (C631938h) null, (C27991fJ) null, "InAppBugReporting", A75, (String) null, (String) null, A0s, (List) null, true);
                finish();
                return;
            }
            throw C18270x1.A0S("contactSupportManager");
        }
        throw C18270x1.A0S("sendFeedback");
    }

    public void BR5(DialogInterface dialogInterface, int i, int i2) {
        C162457s7.A0J(dialogInterface, 1);
        if (i2 == -3 || i2 == -2) {
            dialogInterface.dismiss();
        } else if (i2 == -1) {
            A74().A00(3, (String) null);
            dialogInterface.dismiss();
            finish();
        }
    }

    public void onRestoreInstanceState(Bundle bundle) {
        C162457s7.A0J(bundle, 0);
        super.onRestoreInstanceState(bundle);
        Parcelable[] parcelableArray = bundle.getParcelableArray("save_state_screenshots");
        if (parcelableArray != null) {
            int length = parcelableArray.length;
            int i = 0;
            int i2 = 0;
            while (i < length) {
                Parcelable parcelable = parcelableArray[i];
                int i3 = i2 + 1;
                if (parcelable != null) {
                    A78((Uri) parcelable, i2);
                }
                i++;
                i2 = i3;
            }
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        C162457s7.A0J(bundle, 0);
        super.onSaveInstanceState(bundle);
        bundle.putParcelableArray("save_state_screenshots", this.A0P);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0066  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final /* synthetic */ void A0C(com.whatsapp.inappbugreporting.InAppBugReportingActivity r4, X.C1451074e r5, X.AnonymousClass4Rx r6, int r7) {
        /*
            boolean r0 = r5 instanceof X.C134786jc
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L_0x001a
            r6.setUploadProgressBarVisibility(r3)
            r6.setEnabled(r2)
            r6.setRemoveButtonVisibility(r3)
            com.whatsapp.wds.components.button.WDSButton r3 = r4.A0M
            if (r3 != 0) goto L_0x0080
            java.lang.String r0 = "submitButton"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x001a:
            boolean r0 = r5 instanceof X.C134776jb
            java.lang.String r1 = "describeBugField"
            if (r0 == 0) goto L_0x0036
            r6.setUploadProgressBarVisibility(r2)
            r6.setEnabled(r3)
        L_0x0026:
            r6.setRemoveButtonVisibility(r3)
        L_0x0029:
            com.whatsapp.wds.components.button.WDSButton r3 = r4.A0M
            if (r3 == 0) goto L_0x0066
            com.whatsapp.WaEditText r0 = r4.A09
            if (r0 != 0) goto L_0x006d
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r1)
            throw r0
        L_0x0036:
            boolean r0 = r5 instanceof X.C134756jZ
            if (r0 == 0) goto L_0x004e
            r6.setUploadProgressBarVisibility(r2)
            r6.setEnabled(r3)
            r6.setRetryLayoutVisibility(r3)
            r6.setRemoveButtonVisibility(r3)
            X.3Pg r0 = new X.3Pg
            r0.<init>(r4, r7)
            r6.A04 = r0
            goto L_0x0029
        L_0x004e:
            X.6ja r0 = X.C134766ja.A00
            boolean r0 = X.C162457s7.A0P(r5, r0)
            if (r0 == 0) goto L_0x0083
            r6.setUploadProgressBarVisibility(r2)
            r6.setEnabled(r3)
            android.net.Uri[] r0 = r4.A0P
            r0 = r0[r7]
            if (r0 != 0) goto L_0x0026
            r6.setRemoveButtonVisibility(r2)
            goto L_0x0029
        L_0x0066:
            java.lang.String r0 = "submitButton"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x006d:
            android.text.Editable r0 = r0.getText()
            if (r0 == 0) goto L_0x0080
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x0080
            boolean r0 = X.AnonymousClass4SG.A4B(r4)
            if (r0 != 0) goto L_0x0080
            r2 = 1
        L_0x0080:
            r3.setEnabled(r2)
        L_0x0083:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.inappbugreporting.InAppBugReportingActivity.A0C(com.whatsapp.inappbugreporting.InAppBugReportingActivity, X.74e, X.4Rx, int):void");
    }

    public static final /* synthetic */ void A0L(InAppBugReportingActivity inAppBugReportingActivity, boolean z) {
        int i;
        AnonymousClass5UY r1 = inAppBugReportingActivity.A0L;
        if (z) {
            if (r1 == null) {
                throw C18270x1.A0S("mediaUploadErrorMessageViewStubHolder");
            }
            i = 0;
        } else if (r1 == null) {
            throw C18270x1.A0S("mediaUploadErrorMessageViewStubHolder");
        } else {
            i = 8;
        }
        r1.A06(i);
    }

    public void A5r() {
        if (!this.A0O) {
            this.A0O = true;
            C64333Db A2Y = AnonymousClass4SG.A2Y(this);
            AnonymousClass4SG.A3W(A2Y, this);
            C107695bk r1 = A2Y.A00;
            AnonymousClass4SG.A3Q(A2Y, r1, this, AnonymousClass4SG.A2t(A2Y, r1, this));
            this.A0I = C86614Ku.A0d(A2Y);
            this.A0H = (C106695a0) A2Y.AKA.get();
            this.A0E = C64333Db.A2r(A2Y);
            this.A0F = C64333Db.A4H(A2Y);
            this.A0K = C18280x3.A0Q(r1);
            this.A0D = C18280x3.A0L(r1);
            this.A07 = (AnonymousClass5WY) A2Y.AUS.get();
            this.A0J = (C47362d8) r1.A2c.get();
            this.A0G = (AnonymousClass2WS) r1.A6A.get();
        }
    }

    public final AnonymousClass2WS A74() {
        AnonymousClass2WS r0 = this.A0G;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("supportLogger");
    }

    public final String A75() {
        WaEditText waEditText = this.A09;
        if (waEditText == null) {
            throw C18270x1.A0S("describeBugField");
        }
        String A0g = C86644Kx.A0g(waEditText);
        String stringExtra = getIntent().getStringExtra("extra_message_id");
        String str = "";
        if (stringExtra == null) {
            stringExtra = str;
        }
        boolean z = true;
        if (!C175738Zn.A0V(stringExtra)) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("MessageID: ");
            A0o.append(stringExtra);
            A0g = AnonymousClass000.A0V(";\n", A0g, A0o);
        }
        String stringExtra2 = getIntent().getStringExtra("extra_custom_bloks_use_case");
        if (stringExtra2 == null) {
            stringExtra2 = str;
        }
        if (C162457s7.A0P(stringExtra2, "contextual_help") || C162457s7.A0P(stringExtra2, "help_article")) {
            try {
                String optString = AnonymousClass0x9.A1H(getIntent().getStringExtra("extra_custom_bloks_param")).optString("cms_id");
                if (optString != null) {
                    str = optString;
                }
                if (str.length() <= 0) {
                    z = false;
                }
                if (z) {
                    StringBuilder A0l = AnonymousClass000.A0l(A0g);
                    A0l.append("\n\n\n\nCMS_ID: ");
                    A0l.append(str);
                    A0l.append("\n#wa-dogfooding-pretriaged\n#Oncall_wasce\n");
                    return A0l.toString();
                }
            } catch (JSONException e) {
                Log.w("InAppBugReporting/Custom Params: Could not parse Bloks params", e);
            }
        }
        return A0g;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0027, code lost:
        if (r8.A09.A02() == false) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A77(int r9) {
        /*
            r8 = this;
            X.5ZR r0 = r8.A0E
            if (r0 == 0) goto L_0x007e
            boolean r0 = r0.A0E()
            if (r0 == 0) goto L_0x0069
            X.66R r1 = r8.A0Q
            boolean r0 = X.C86614Ku.A1b(r1)
            r7 = 1
            if (r0 == 0) goto L_0x0014
            r7 = 5
        L_0x0014:
            boolean r0 = X.C86614Ku.A1b(r1)
            if (r0 == 0) goto L_0x0029
            com.whatsapp.Me r0 = X.AnonymousClass4SG.A2b(r8)
            if (r0 == 0) goto L_0x0029
            X.2jE r0 = r8.A09
            boolean r0 = r0.A02()
            r6 = 1
            if (r0 != 0) goto L_0x002a
        L_0x0029:
            r6 = 0
        L_0x002a:
            r5 = 1
            r4 = 40
            r3 = 0
            android.content.Intent r2 = X.C18320x8.A07()
            java.lang.String r1 = r8.getPackageName()
            java.lang.String r0 = "com.whatsapp.gallerypicker.GalleryPicker"
            r2.setClassName(r1, r0)
            java.lang.String r0 = "include_media"
            r2.putExtra(r0, r7)
            java.lang.String r0 = "max_items"
            r2.putExtra(r0, r5)
            java.lang.String r0 = "preview"
            r2.putExtra(r0, r6)
            java.lang.String r0 = "origin"
            r2.putExtra(r0, r4)
            java.lang.String r0 = "send"
            r2.putExtra(r0, r3)
            java.lang.String r0 = "should_hide_caption_view"
            r2.putExtra(r0, r5)
            java.lang.String r0 = "skip_max_items_new_limit"
            r2.putExtra(r0, r5)
            java.lang.String r0 = "should_set_gallery_result"
            r2.putExtra(r0, r5)
            r0 = r9 | 16
            r8.startActivityForResult(r2, r0)
            return
        L_0x0069:
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 30
            r2 = 2131892518(0x7f121926, float:1.9419787E38)
            if (r1 >= r0) goto L_0x0075
            r2 = 2131892448(0x7f1218e0, float:1.9419645E38)
        L_0x0075:
            r1 = 2131892517(0x7f121925, float:1.9419785E38)
            r0 = r9 | 32
            com.whatsapp.RequestPermissionActivity.A0c(r8, r1, r2, r0)
            return
        L_0x007e:
            java.lang.String r0 = "waPermissionsHelper"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.inappbugreporting.InAppBugReportingActivity.A77(int):void");
    }

    public final void A78(Uri uri, int i) {
        int i2;
        Bitmap bitmap;
        RuntimeException runtimeException;
        long j;
        LinearLayout linearLayout = this.A03;
        if (linearLayout == null) {
            throw C18270x1.A0S("screenshotsGroup");
        }
        View childAt = linearLayout.getChildAt(i);
        C162457s7.A0K(childAt, "null cannot be cast to non-null type com.whatsapp.inappbugreporting.view.AddScreenshotImageViewWithRemoveButton");
        AnonymousClass4Rx r1 = (AnonymousClass4Rx) childAt;
        Uri uri2 = uri;
        if (uri != null) {
            Point A072 = AnonymousClass4L0.A07();
            C86604Kt.A0x(this, A072);
            int i3 = A072.x / 3;
            try {
                if (C989053r.A08(C107655bf.A0W(uri2, ((InAppBugReportingViewModel) this.A0Q.getValue()).A0H.A03.A0R()))) {
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    String queryParameter = uri2.getQueryParameter("from");
                    if (queryParameter == null || queryParameter.length() == 0) {
                        j = 0;
                    } else {
                        j = Long.parseLong(queryParameter);
                    }
                    bitmap = C107085af.A00(new AnonymousClass8HQ(this, uri2), -1, 0, timeUnit.toMicros(j), false, true);
                } else {
                    C106695a0 r9 = this.A0H;
                    if (r9 != null) {
                        int i4 = i3 / 2;
                        WhatsAppLibLoader whatsAppLibLoader = this.A0I;
                        if (whatsAppLibLoader != null) {
                            bitmap = r9.A05(uri2, i4, i3, whatsAppLibLoader.A03(), false);
                        } else {
                            runtimeException = C18270x1.A0S("whatsAppLibLoader");
                        }
                    } else {
                        runtimeException = C18270x1.A0S("mediaUtils");
                    }
                    throw runtimeException;
                }
                if (bitmap != null) {
                    this.A0P[i] = uri;
                    r1.setScreenshot(bitmap);
                    return;
                }
                C18260x0.A1Q(AnonymousClass001.A0o(), "InAppBugReporting/screenshot/bitmap is null ", uri2);
                Bot(R.string.f11nameremoved);
            } catch (IOException e) {
                C18260x0.A0k(uri2, "InAppBugReporting/screenshot/io-exception ", AnonymousClass001.A0o(), e);
                i2 = R.string.f11nameremoved;
                Bot(i2);
            } catch (C1000259c e2) {
                C18260x0.A0k(uri2, "InAppBugReporting/screenshot/not-an-image ", AnonymousClass001.A0o(), e2);
                i2 = R.string.f11nameremoved;
                Bot(i2);
            }
        } else {
            r1.A00();
        }
    }

    public void onBackPressed() {
        if (!(((InAppBugReportingViewModel) this.A0Q.getValue()).A09.A07() instanceof C134736jX)) {
            WaEditText waEditText = this.A09;
            if (waEditText == null) {
                throw C18270x1.A0S("describeBugField");
            } else if (AnonymousClass2AB.A00(C86644Kx.A0g(waEditText)).length() > 0) {
                AnonymousClass5OS A002 = C1001459r.A00(AnonymousClass4L0.A0U(), -1, R.string.f11nameremoved);
                A002.A01 = R.string.f11nameremoved;
                A002.A03 = R.string.f11nameremoved;
                C86644Kx.A1D(A002.A00(), this);
                return;
            }
        }
        super.onBackPressed();
    }

    public InAppBugReportingActivity(int i) {
        this.A0O = false;
        C86604Kt.A1K(this, 49);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        WaTextView waTextView;
        Uri uri;
        super.onActivityResult(i, i2, intent);
        String str = null;
        if ((i & 16) == 16) {
            if (i2 == -1 && intent != null) {
                ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("android.intent.extra.STREAM");
                if (parcelableArrayListExtra == null || parcelableArrayListExtra.size() <= 0 || (uri = (Uri) AnonymousClass0x9.A0t(parcelableArrayListExtra)) == null) {
                    Bot(R.string.f11nameremoved);
                    return;
                }
                try {
                    grantUriPermission("com.whatsapp", uri, 1);
                } catch (SecurityException e) {
                    Log.w("InAppBugReporting/permission", e);
                }
                int i3 = i - 16;
                A78(uri, i3);
                AnonymousClass66R r1 = this.A0Q;
                if (C86614Ku.A1b(r1) && AnonymousClass4SG.A2b(this) != null && this.A09.A02()) {
                    ((InAppBugReportingViewModel) r1.getValue()).A0D(uri, i3);
                }
            }
        } else if ((i & 32) == 32) {
            if (i2 == -1) {
                A77(i - 32);
            }
        } else if (i == 3 && i2 == -1) {
            if (intent != null) {
                String stringExtra = intent.getStringExtra("bug_category_title");
                if (!(stringExtra == null || (waTextView = this.A0B) == null)) {
                    waTextView.setText(stringExtra);
                }
                str = intent.getStringExtra("bug_category_type");
            }
            this.A0N = str;
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        A74().A00(2, (String) null);
        setContentView((int) R.layout.f8nameremoved);
        AnonymousClass0R8 supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.A0N(true);
            supportActionBar.A0J(getString(R.string.f11nameremoved));
        }
        this.A03 = (LinearLayout) C18290x4.A0L(this, R.id.screenshots_group);
        this.A0L = AnonymousClass1Ha.A1p(this, R.id.media_upload_error_message_stub);
        LinearLayout linearLayout = this.A03;
        if (linearLayout == null) {
            throw C18270x1.A0S("screenshotsGroup");
        }
        linearLayout.removeAllViews();
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
        int i = 0;
        do {
            AnonymousClass4Rx r2 = new AnonymousClass4Rx(this);
            LinearLayout.LayoutParams A0C2 = C86624Kv.A0C();
            int i2 = dimensionPixelSize;
            if (i == 0) {
                i2 = 0;
            }
            A0C2.leftMargin = i2;
            A0C2.rightMargin = dimensionPixelSize;
            A0C2.topMargin = dimensionPixelSize;
            A0C2.bottomMargin = dimensionPixelSize;
            LinearLayout linearLayout2 = this.A03;
            if (linearLayout2 == null) {
                throw C18270x1.A0S("screenshotsGroup");
            }
            linearLayout2.addView(r2, A0C2);
            C109695f2.A00(r2, this, i, 12);
            r2.A03 = new C67423Pf(this, i);
            i++;
        } while (i < 3);
        TextEmojiLabel textEmojiLabel = (TextEmojiLabel) C18290x4.A0L(this, R.id.submit_bug_info_text);
        this.A08 = textEmojiLabel;
        C106715a2 r4 = this.A0K;
        if (r4 == null) {
            throw C18270x1.A0S("linkifier");
        } else if (textEmojiLabel == null) {
            throw C18270x1.A0S("submitBugInfoTextView");
        } else {
            Context context = textEmojiLabel.getContext();
            TextEmojiLabel textEmojiLabel2 = this.A08;
            if (textEmojiLabel2 == null) {
                throw C18270x1.A0S("submitBugInfoTextView");
            }
            String A1K = C86664Kz.A1K(textEmojiLabel2);
            TextEmojiLabel textEmojiLabel3 = this.A08;
            if (textEmojiLabel3 == null) {
                throw C18270x1.A0S("submitBugInfoTextView");
            }
            SpannableStringBuilder A062 = r4.A06(context, new C70003Zm(this, 31), A1K, "learn-more", AnonymousClass5Yj.A02(textEmojiLabel3.getContext(), R.attr.f3nameremoved, R.color.f5nameremoved));
            TextEmojiLabel textEmojiLabel4 = this.A08;
            if (textEmojiLabel4 == null) {
                throw C18270x1.A0S("submitBugInfoTextView");
            }
            AnonymousClass0x2.A14(this.A0D, textEmojiLabel4);
            TextEmojiLabel textEmojiLabel5 = this.A08;
            if (textEmojiLabel5 == null) {
                throw C18270x1.A0S("submitBugInfoTextView");
            }
            textEmojiLabel5.setText(A062);
            this.A09 = (WaEditText) C18290x4.A0L(this, R.id.describe_problem_field);
            this.A0C = (WaTextView) C18290x4.A0L(this, R.id.describe_problem_field_error);
            WaEditText waEditText = this.A09;
            if (waEditText == null) {
                throw C18270x1.A0S("describeBugField");
            }
            AnonymousClass68H.A00(waEditText, this, 9);
            WDSButton wDSButton = (WDSButton) C18290x4.A0L(this, R.id.submit_btn);
            C162457s7.A0J(wDSButton, 0);
            this.A0M = wDSButton;
            WaEditText waEditText2 = this.A09;
            if (waEditText2 == null) {
                throw C18270x1.A0S("describeBugField");
            }
            Editable text = waEditText2.getText();
            boolean z = true;
            if (text == null || text.length() <= 0 || AnonymousClass4SG.A4B(this)) {
                z = false;
            }
            wDSButton.setEnabled(z);
            WDSButton wDSButton2 = this.A0M;
            if (wDSButton2 != null) {
                C635439q.A00(wDSButton2, this, 28);
                AnonymousClass66R r42 = this.A0Q;
                C86604Kt.A1N(this, ((InAppBugReportingViewModel) r42.getValue()).A08, new C1216361h(this), 256);
                C86604Kt.A1N(this, ((InAppBugReportingViewModel) r42.getValue()).A09, new C1216461i(this), 257);
                if (C86614Ku.A1b(r42)) {
                    C86604Kt.A1N(this, ((InAppBugReportingViewModel) r42.getValue()).A02, new C1216561j(this), 251);
                    C86604Kt.A1N(this, ((InAppBugReportingViewModel) r42.getValue()).A00, new C1216661k(this), 252);
                    C86604Kt.A1N(this, ((InAppBugReportingViewModel) r42.getValue()).A01, new C1216761l(this), 253);
                    C86604Kt.A1N(this, ((InAppBugReportingViewModel) r42.getValue()).A07, new AnonymousClass8YD(this), 254);
                    C86604Kt.A1N(this, ((InAppBugReportingViewModel) r42.getValue()).A0I, new AnonymousClass42Y(this), 255);
                    WaEditText waEditText3 = (WaEditText) C005205m.A00(this, R.id.title_edit_text);
                    waEditText3.setVisibility(0);
                    this.A0A = waEditText3;
                    WaTextView waTextView = (WaTextView) C005205m.A00(this, R.id.category_text_view);
                    waTextView.setVisibility(0);
                    C635439q.A00(waTextView, this, 27);
                    this.A0B = waTextView;
                    View A002 = C005205m.A00(this, R.id.category_underline);
                    A002.setVisibility(0);
                    this.A01 = A002;
                }
                String stringExtra = getIntent().getStringExtra("extra_screenshot_uri");
                if (stringExtra != null) {
                    A78(Uri.parse(stringExtra), 0);
                    if (C86614Ku.A1b(r42) && AnonymousClass4SG.A2b(this) != null && this.A09.A02()) {
                        Uri parse = Uri.parse(stringExtra);
                        C162457s7.A0D(parse);
                        ((InAppBugReportingViewModel) r42.getValue()).A0D(parse, 0);
                    }
                }
                if (AnonymousClass0x9.A1N(getIntent(), "extra_is_calling_bug")) {
                    AnonymousClass39J r22 = (AnonymousClass39J) getIntent().getParcelableExtra("extra_call_log_key");
                    AnonymousClass2SK r1 = ((InAppBugReportingViewModel) r42.getValue()).A0B.A07;
                    if (r22 != null) {
                        r1.A01 = r22;
                    } else {
                        r1.A00 = Voip.getCallInfo();
                    }
                }
            } else {
                throw C18270x1.A0S("submitButton");
            }
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (C18290x4.A04(menuItem) != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }

    public InAppBugReportingActivity() {
        this(0);
        this.A0P = new Uri[3];
        this.A0Q = C154517dI.A01(new AnonymousClass8WN(this));
    }
}
