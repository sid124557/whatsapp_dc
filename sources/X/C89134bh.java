package X;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.whatsapp.R;
import com.whatsapp.WaImageButton;
import com.whatsapp.documentpicker.DocumentPreviewActivity;
import com.whatsapp.emoji.search.EmojiSearchProvider;
import com.whatsapp.gifvideopreview.GifVideoPreviewActivity;
import com.whatsapp.mediacomposer.bottombar.recipients.RecipientsView;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.Collections;
import java.util.List;

/* renamed from: X.4bh  reason: invalid class name and case insensitive filesystem */
public abstract class C89134bh extends C131746e7 implements C185458ti, AnonymousClass64G, C182608oh, C182628oj {
    public View A00;
    public View A01;
    public FrameLayout A02;
    public ImageView A03;
    public C103215Lz A04;
    public C64773Ex A05;
    public AnonymousClass5ZU A06;
    public AnonymousClass5U6 A07;
    public C56982ss A08;
    public C108845de A09;
    public C620233e A0A;
    public AnonymousClass5IY A0B;
    public C27821ej A0C;
    public EmojiSearchProvider A0D;
    public AnonymousClass5Oa A0E;
    public AnonymousClass5Q1 A0F;
    public C60152y5 A0G;
    public AnonymousClass5TZ A0H;
    public C102855Kn A0I;
    public C989053r A0J;
    public C56042rK A0K;
    public C104745Se A0L;
    public C183538qC A0M;
    public File A0N;
    public List A0O;
    public List A0P;
    public boolean A0Q;

    public void A76(File file, boolean z) {
        DocumentPreviewActivity documentPreviewActivity = (DocumentPreviewActivity) this;
        if (documentPreviewActivity.A0P.size() == 0) {
            documentPreviewActivity.A77(false);
            return;
        }
        Uri uri = (Uri) documentPreviewActivity.getIntent().getParcelableExtra("uri");
        if (uri != null) {
            File file2 = file;
            if (z) {
                documentPreviewActivity.A00.A04(uri, documentPreviewActivity, (C624134x) null, file2, documentPreviewActivity.A0I.A06.getStringText(), documentPreviewActivity.A0P, documentPreviewActivity.A0I.A06.getMentions(), 1, false);
                documentPreviewActivity.Bqv(documentPreviewActivity.A0P);
                documentPreviewActivity.setResult(-1);
            } else {
                Intent A072 = C18320x8.A07();
                if (file != null) {
                    A072.putExtra("file_path", file.getPath());
                }
                A072.putExtra("uri", documentPreviewActivity.getIntent().getParcelableExtra("uri"));
                A072.putExtra("caption", documentPreviewActivity.A0I.A06.getStringText());
                A072.putExtra("mentions", AnonymousClass4SQ.A00(documentPreviewActivity.A0I.A06));
                C86654Ky.A0x(A072, documentPreviewActivity.A0P);
                A072.putExtra("clear_message_after_send", documentPreviewActivity.getIntent().getBooleanExtra("clear_message_after_send", false));
                documentPreviewActivity.setResult(-1, A072);
            }
            documentPreviewActivity.finish();
        }
    }

    public final void A75() {
        this.A0M.get();
        A76(this.A0N, AnonymousClass0x9.A1N(getIntent(), "send"));
        this.A07.A03(2);
        this.A0N = null;
    }

    public void A77(boolean z) {
        int i;
        AnonymousClass5PH r1 = new AnonymousClass5PH(this);
        r1.A0H = true;
        r1.A0L = true;
        r1.A0b = this.A0P;
        if (this instanceof GifVideoPreviewActivity) {
            i = 13;
        } else {
            i = 9;
        }
        r1.A0Z = AnonymousClass002.A0J(Collections.singleton(Integer.valueOf(i)));
        r1.A0M = Boolean.valueOf(z);
        Intent A012 = AnonymousClass5PH.A01(r1);
        this.A0H.A01(A012, this.A09);
        startActivityForResult(A012, 1);
    }

    public /* synthetic */ void BM5() {
    }

    public void BW6(File file, String str) {
        this.A0N = file;
        if (TextUtils.isEmpty(getIntent().getStringExtra("media_url")) && file == null) {
            Log.e("MediaPreviewActivity/onMediaFileLoaded neither file nor media url provided");
            finish();
        }
    }

    public /* synthetic */ void BfV() {
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AnonymousClass0R8 supportActionBar = getSupportActionBar();
        boolean z = false;
        if (supportActionBar != null) {
            supportActionBar.A0N(true);
            supportActionBar.A0P(false);
        }
        AnonymousClass3ZH r5 = null;
        View inflate = getLayoutInflater().inflate(R.layout.f8nameremoved, (ViewGroup) null, false);
        this.A00 = inflate;
        setContentView(inflate);
        this.A02 = C86654Ky.A0L(this.A00, R.id.preview_holder);
        this.A01 = C005205m.A00(this, R.id.loading_progress);
        this.A03 = C86664Kz.A0u(this, R.id.thumb_view);
        this.A01.setVisibility(0);
        this.A03.setVisibility(0);
        Parcelable parcelableExtra = getIntent().getParcelableExtra("uri");
        if (parcelableExtra == null) {
            BW6((File) null, (String) null);
        } else {
            AnonymousClass55N r2 = new AnonymousClass55N(this, this, this.A0J);
            this.A04.BkO(r2, parcelableExtra);
        }
        C95814uZ A002 = C106405Yw.A00(this);
        if (A002 != null) {
            List singletonList = Collections.singletonList(A002);
            this.A0O = singletonList;
            this.A0P = singletonList;
        } else {
            List A12 = C86634Kw.A12(getIntent(), C95814uZ.class, "jids");
            this.A0O = A12;
            this.A0P = A12;
        }
        this.A0E = this.A04.A00((RecipientsView) C005205m.A00(this, R.id.media_recipients));
        this.A0F = new AnonymousClass5Q1((WaImageButton) C005205m.A00(this, R.id.send), this.A00);
        if (getIntent().getBooleanExtra("usage_quote", false) || C627336j.A0N(this.A0P)) {
            RecipientsView recipientsView = this.A0E.A04;
            recipientsView.A05 = false;
            recipientsView.A00 = R.color.f5nameremoved;
        } else {
            this.A0E.A04.setRecipientsListener(this);
        }
        AnonymousClass5Q1 r22 = this.A0F;
        AnonymousClass54E.A00(r22.A01, this, r22, 17);
        if (this.A0L.A00()) {
            z = Boolean.TRUE.equals(this.A0K.A01(AnonymousClass21S.A0O));
        } else {
            this.A0M.get();
        }
        this.A09 = new C108845de(this.A0A.A07(), this.A0A.A08(), this.A0A.A02(), z, false);
        A74();
        AnonymousClass1VX r16 = this.A0D;
        C105895Wv r15 = this.A0B;
        C55682qk r13 = this.A03;
        AnonymousClass5Y0 r12 = this.A0C;
        C27821ej r11 = this.A0C;
        C620633i r10 = this.A08;
        C620733j r8 = this.A00;
        AnonymousClass5IY r7 = this.A0B;
        EmojiSearchProvider emojiSearchProvider = this.A0D;
        AnonymousClass33p r3 = this.A09;
        C60152y5 r23 = this.A0G;
        AnonymousClass487 r1 = this.A0B;
        View view = this.A00;
        if (A002 != null) {
            r5 = this.A05.A0A(A002);
        }
        C105895Wv r29 = r15;
        C27821ej r232 = r11;
        AnonymousClass5Y0 r24 = r12;
        EmojiSearchProvider emojiSearchProvider2 = emojiSearchProvider;
        AnonymousClass3ZH r20 = r5;
        AnonymousClass487 r21 = r1;
        AnonymousClass5IY r222 = r7;
        C620633i r17 = r10;
        AnonymousClass33p r18 = r3;
        C620733j r19 = r8;
        View view2 = view;
        C55682qk r162 = r13;
        this.A0I = new C102855Kn(this, view2, r162, r17, r18, r19, r20, r21, r222, r232, r24, emojiSearchProvider2, r16, this, r23, r29, getIntent().getStringExtra("caption"), C624435a.A03(getIntent().getStringExtra("mentions")), AnonymousClass4SG.A45(this));
    }

    public /* synthetic */ void onDismiss() {
    }

    public void A74() {
        View A002 = C005205m.A00(this, R.id.input_container);
        boolean A1W = AnonymousClass001.A1W(this.A0P.size());
        this.A0E.A00(this.A09, this.A0P, true);
        C620733j r0 = this.A00;
        if (A1W) {
            C154367d3.A00(A002, r0);
        } else {
            C154367d3.A01(A002, r0);
        }
        this.A0F.A01(A1W);
    }

    public void BZc(boolean z) {
        C18260x0.A1D("MediaPreviewActivity/onRecipientsClicked/statusChipClicked: ", AnonymousClass001.A0o(), z);
        this.A0Q = true;
        A77(z);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1) {
            this.A0P = C86604Kt.A0r(intent);
            C626936e.A06(intent);
            C108845de A002 = this.A0H.A00(intent.getExtras());
            C626936e.A06(A002);
            this.A09 = A002;
            A74();
            if (i2 == -1) {
                Log.d("MediaPreviewActivity/onActivityResult/sendGif");
                A76(this.A0N, AnonymousClass0x9.A1N(getIntent(), "send"));
                this.A07.A03(2);
                this.A0N = null;
            }
        }
    }

    public void onDestroy() {
        super.onDestroy();
        if (this.A0N != null && isFinishing()) {
            this.A0N.getPath();
            C627536m.A0O(this.A0N);
        }
    }

    public void BOV() {
        A75();
    }

    public void BbE() {
        A75();
    }
}
