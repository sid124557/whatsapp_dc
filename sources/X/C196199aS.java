package X;

import android.app.DatePickerDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.CharacterStyle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.videoplayback.BloksVideoPlayerView;
import com.whatsapp.videoplayback.VideoSurfaceView;
import java.io.File;
import java.math.BigDecimal;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: X.9aS  reason: invalid class name and case insensitive filesystem */
public class C196199aS implements C186518vU {
    public final C184988ss A00;
    public final C69263Wi A01;
    public final C193979Rc A02;
    public final C59482wz A03;
    public final C44232Ve A04;
    public final C620633i A05;
    public final C620733j A06;
    public final AnonymousClass1VX A07;
    public final C105895Wv A08;
    public final C183538qC A09;

    public static void A01(AnonymousClass7KP r8, float f, float f2, float f3) {
        if (r8 != null) {
            double d = (double) f3;
            BigDecimal bigDecimal = new BigDecimal(((double) Math.round(((double) f) / d)) * d);
            BigDecimal bigDecimal2 = new BigDecimal(((double) Math.round(((double) f2) / d)) * d);
            float floatValue = bigDecimal.floatValue();
            float floatValue2 = bigDecimal2.floatValue();
            AnonymousClass84O r6 = r8.A01;
            C835248t r5 = r8.A02;
            C153427bI r4 = r8.A00;
            C152057Xj r3 = new C152057Xj();
            r3.A05(C159427lo.A00((double) floatValue), 0);
            r3.A05(C159427lo.A00((double) floatValue2), 1);
            C159377lj.A01(r4, r6, r3.A03(), r5);
        }
    }

    public void Ay0(ImageView imageView, C15810ry r19, C15810ry r20, Object obj, String str, String str2, String str3, String str4) {
        File A002;
        String str5 = str;
        String str6 = str2;
        ImageView imageView2 = imageView;
        C15810ry r5 = r19;
        C15810ry r4 = r20;
        String str7 = str3;
        if (!TextUtils.isEmpty(str5)) {
            C59482wz r6 = this.A03;
            C193979Rc r2 = this.A02;
            if (!TextUtils.isEmpty(str6)) {
                String str8 = str6;
                if (str3 != null && AnonymousClass001.A1Z(r5.get())) {
                    str8 = str7;
                }
                r6.A00(new C196099aI(imageView2, r4), str8);
            }
            r2.A00().A01((Drawable) null, (Drawable) null, imageView2, new C197839dx(imageView2, r4, r5, r6, str6, str7, AnonymousClass0x9.A14(imageView2), AnonymousClass0x9.A14(obj)), str5);
        } else if (!TextUtils.isEmpty(str6)) {
            C59482wz r1 = this.A03;
            if (str3 != null && AnonymousClass001.A1Z(r5.get())) {
                str6 = str7;
            }
            r1.A00(new C196099aI(imageView2, r4), str6);
        } else {
            String str9 = str4;
            if (!TextUtils.isEmpty(str9) && (A002 = this.A04.A00(str9)) != null) {
                imageView2.setImageBitmap(BitmapFactory.decodeFile(A002.getAbsolutePath()));
            }
        }
    }

    public void B20(ImageView imageView, byte[] bArr) {
        Bitmap decodeByteArray;
        int i;
        int i2;
        if (Build.VERSION.SDK_INT <= 23) {
            Context context = imageView.getContext();
            C162457s7.A0J(context, 0);
            Point point = new Point();
            C620633i.A01(context).getDefaultDisplay().getSize(point);
            if (AnonymousClass001.A0M(context).orientation == 2 && (i = point.x) < (i2 = point.y)) {
                point.y = i;
                point.x = i2;
            }
            int dimensionPixelSize = point.y - (context.getResources().getDimensionPixelSize(R.dimen.f6nameremoved) + AnonymousClass5YL.A01(context, C620633i.A01(context)));
            point.y = dimensionPixelSize;
            int i3 = point.x;
            decodeByteArray = C107245ax.A05((AnonymousClass5QA) null, new AnonymousClass5WB(new BitmapFactory.Options(), Long.valueOf(C58152un.A00 / ((long) 32)), i3, dimensionPixelSize, false), bArr, false).A02;
        } else {
            decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
        }
        imageView.setImageBitmap(decodeByteArray);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0079, code lost:
        r4.setSpan(r0, r3, r2 + r3, 0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.text.Spannable B7q(android.content.Context r13, android.content.Context r14, X.C15790rw r15, java.lang.String r16, java.util.List r17, java.util.List r18, java.util.List r19, java.util.List r20) {
        /*
            r12 = this;
            r0 = r16
            if (r16 == 0) goto L_0x0128
            android.text.SpannableStringBuilder r4 = new android.text.SpannableStringBuilder
            r4.<init>(r0)
            if (r17 == 0) goto L_0x007e
            java.util.Iterator r8 = r17.iterator()
        L_0x000f:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x007e
            java.lang.String r0 = X.AnonymousClass001.A0m(r8)
            org.json.JSONObject r5 = X.AnonymousClass0x9.A1H(r0)
            java.lang.String r0 = "offset"
            int r3 = r5.getInt(r0)
            java.lang.String r0 = "length"
            int r2 = r5.getInt(r0)
            java.lang.String r1 = "inline_style"
            boolean r0 = r5.has(r1)
            if (r0 != 0) goto L_0x0033
            java.lang.String r1 = "style"
        L_0x0033:
            java.lang.String r7 = r5.getString(r1)
            int r0 = r7.hashCode()
            r6 = 2
            r5 = 1
            r1 = 0
            switch(r0) {
                case -2125451728: goto L_0x0042;
                case 2044549: goto L_0x0050;
                case 1759631020: goto L_0x005e;
                case 2143721139: goto L_0x006c;
                default: goto L_0x0041;
            }
        L_0x0041:
            goto L_0x000f
        L_0x0042:
            java.lang.String r0 = "ITALIC"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x000f
            android.text.style.StyleSpan r0 = new android.text.style.StyleSpan
            r0.<init>(r6)
            goto L_0x0079
        L_0x0050:
            java.lang.String r0 = "BOLD"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x000f
            android.text.style.StyleSpan r0 = new android.text.style.StyleSpan
            r0.<init>(r5)
            goto L_0x0079
        L_0x005e:
            java.lang.String r0 = "UNDERLINE"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x000f
            android.text.style.UnderlineSpan r0 = new android.text.style.UnderlineSpan
            r0.<init>()
            goto L_0x0079
        L_0x006c:
            java.lang.String r0 = "STRIKETHROUGH"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x000f
            android.text.style.StrikethroughSpan r0 = new android.text.style.StrikethroughSpan
            r0.<init>()
        L_0x0079:
            int r2 = r2 + r3
            r4.setSpan(r0, r3, r2, r1)
            goto L_0x000f
        L_0x007e:
            r5 = 0
            if (r18 == 0) goto L_0x00c0
            java.util.Iterator r7 = r18.iterator()
        L_0x0085:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x00c0
            java.lang.String r0 = X.AnonymousClass001.A0m(r7)
            org.json.JSONObject r6 = X.AnonymousClass0x9.A1H(r0)
            java.lang.String r0 = "offset"
            int r3 = r6.getInt(r0)
            java.lang.String r0 = "length"
            int r2 = r6.getInt(r0)
            java.lang.String r1 = "hex_rgb_color_with_pound_key"
            boolean r0 = r6.has(r1)
            if (r0 == 0) goto L_0x00b9
            java.lang.String r0 = r6.getString(r1)
            int r1 = android.graphics.Color.parseColor(r0)
        L_0x00af:
            android.text.style.ForegroundColorSpan r0 = new android.text.style.ForegroundColorSpan
            r0.<init>(r1)
            int r2 = r2 + r3
            r4.setSpan(r0, r3, r2, r5)
            goto L_0x0085
        L_0x00b9:
            java.lang.String r0 = "color"
            int r1 = r6.getInt(r0)
            goto L_0x00af
        L_0x00c0:
            if (r19 == 0) goto L_0x00f7
            java.util.Iterator r3 = r19.iterator()
        L_0x00c6:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x00f7
            java.lang.String r0 = X.AnonymousClass001.A0m(r3)
            org.json.JSONObject r0 = X.AnonymousClass0x9.A1H(r0)
            X.9Ow r2 = new X.9Ow
            r2.<init>(r0)
            X.3Wi r9 = r12.A01
            X.33i r10 = r12.A05
            X.8ss r8 = r12.A00
            java.lang.String r11 = r2.A02
            X.4b3 r6 = new X.4b3
            r7 = r14
            r6.<init>(r7, r8, r9, r10, r11)
            X.9a5 r0 = new X.9a5
            r0.<init>(r15, r2)
            r6.A02 = r0
            int r1 = r2.A01
            int r0 = r2.A00
            int r0 = r0 + r1
            r4.setSpan(r6, r1, r0, r5)
            goto L_0x00c6
        L_0x00f7:
            if (r20 == 0) goto L_0x0129
            java.util.Iterator r8 = r20.iterator()
        L_0x00fd:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0129
            java.lang.String r0 = X.AnonymousClass001.A0m(r8)
            org.json.JSONObject r1 = X.AnonymousClass0x9.A1H(r0)
            java.lang.String r0 = "offset"
            int r7 = r1.getInt(r0)
            java.lang.String r0 = "length"
            int r6 = r1.getInt(r0)
            java.lang.String r0 = "scale"
            double r2 = r1.getDouble(r0)
            float r1 = (float) r2
            android.text.style.RelativeSizeSpan r0 = new android.text.style.RelativeSizeSpan
            r0.<init>(r1)
            int r6 = r6 + r7
            r4.setSpan(r0, r7, r6, r5)
            goto L_0x00fd
        L_0x0128:
            r4 = 0
        L_0x0129:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C196199aS.B7q(android.content.Context, android.content.Context, X.0rw, java.lang.String, java.util.List, java.util.List, java.util.List, java.util.List):android.text.Spannable");
    }

    public InputFilter BA1() {
        return new C195369Xn();
    }

    public CharacterStyle BER(Runnable runnable, int i, int i2, int i3) {
        return new AnonymousClass976(runnable, i);
    }

    public Locale BEW() {
        return this.A06.A0O();
    }

    public void BmV(AnonymousClass03n r2) {
        AnonymousClass0x2.A14(this.A07, (TextEmojiLabel) r2);
    }

    public void BqH() {
        C106755a7.A03(this.A05);
    }

    public C196199aS(C184988ss r1, C69263Wi r2, C193979Rc r3, C59482wz r4, C44232Ve r5, C620633i r6, C620733j r7, AnonymousClass1VX r8, C105895Wv r9, C183538qC r10) {
        this.A07 = r8;
        this.A01 = r2;
        this.A08 = r9;
        this.A09 = r10;
        this.A05 = r6;
        this.A06 = r7;
        this.A00 = r1;
        this.A04 = r5;
        this.A03 = r4;
        this.A02 = r3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        if (r3.length() <= 0) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(com.google.android.material.textfield.TextInputEditText r3, com.google.android.material.textfield.TextInputLayout r4, boolean r5) {
        /*
            android.text.Editable r3 = r3.getText()
            X.6Ff r0 = r4.A17
            int r1 = r0.A01
            r0 = 2
            if (r1 == r0) goto L_0x000d
            if (r1 != 0) goto L_0x0032
        L_0x000d:
            r2 = 0
            if (r5 == 0) goto L_0x0019
            if (r3 == 0) goto L_0x0019
            int r1 = r3.length()
            r0 = 1
            if (r1 > 0) goto L_0x001a
        L_0x0019:
            r0 = 0
        L_0x001a:
            r4.setEndIconVisible(r0)
            if (r5 == 0) goto L_0x0032
            r0 = 2131231474(0x7f0802f2, float:1.807903E38)
            r4.setEndIconDrawable((int) r0)
            r0 = 2131895750(0x7f1225c6, float:1.9426342E38)
            r4.setEndIconContentDescription((int) r0)
            r4.setEndIconCheckable(r2)
            r0 = 0
            r4.setEndIconTintList(r0)
        L_0x0032:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C196199aS.A00(com.google.android.material.textfield.TextInputEditText, com.google.android.material.textfield.TextInputLayout, boolean):void");
    }

    public void Ay1(Context context, View view, C15790rw r21, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, boolean z, boolean z2) {
        View view2 = view;
        RecyclerView recyclerView = (RecyclerView) C06560Yg.A02(view2, R.id.recycler_view);
        view2.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.A0h = true;
        String str9 = str;
        try {
            C15790rw r5 = r21;
            recyclerView.setAdapter(new AnonymousClass954(LayoutInflater.from(context), r5, this.A02.A00(), str2, str3, str4, str5, str6, str7, str8, new JSONArray(str9), i, z, z2));
        } catch (JSONException unused) {
            C18260x0.A0r("WaBkComponentConfiguratorImpl/bindView data source is not a valid JSON: ", str9, AnonymousClass001.A0o());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0069, code lost:
        if (r2 != false) goto L_0x003f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Ay2(android.view.View r5, X.AnonymousClass7KP r6, float r7, int r8, int r9, int r10, int r11) {
        /*
            r4 = this;
            r0 = 2131428061(0x7f0b02dd, float:1.8477756E38)
            android.view.View r3 = X.C06560Yg.A02(r5, r0)
            com.whatsapp.bloks.ui.widgets.rangeslider.WaRangeSeekBar r3 = (com.whatsapp.bloks.ui.widgets.rangeslider.WaRangeSeekBar) r3
            float r2 = (float) r8
            float r1 = (float) r9
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0045
            r3.A01 = r2
            r3.A00 = r1
            float r0 = r3.A03
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 == 0) goto L_0x002a
            float r0 = r3.A02
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 == 0) goto L_0x002a
            r3.A03 = r2
            r3.A02 = r1
            r3.A02()
        L_0x002a:
            float r0 = r3.A03
            float r1 = r3.A01
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x006c
            r3.A03 = r1
            r2 = 1
        L_0x0035:
            float r0 = r3.A02
            float r1 = r3.A00
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0069
            r3.A02 = r1
        L_0x003f:
            r3.invalidate()
            r3.A02()
        L_0x0045:
            float r2 = (float) r10
            float r1 = (float) r11
            float r0 = r3.A01
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x0061
            float r0 = r3.A00
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x0061
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0061
            r3.A03 = r2
            r3.A02 = r1
            r3.invalidate()
            r3.A02()
        L_0x0061:
            X.9ad r0 = new X.9ad
            r0.<init>(r6, r7)
            r3.A0D = r0
            return
        L_0x0069:
            if (r2 == 0) goto L_0x0045
            goto L_0x003f
        L_0x006c:
            r2 = 0
            goto L_0x0035
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C196199aS.Ay2(android.view.View, X.7KP, float, int, int, int, int):void");
    }

    public void Ay3(View view, String str, boolean z) {
        int i;
        File A002;
        VideoSurfaceView videoSurfaceView = (VideoSurfaceView) C06560Yg.A02(view, R.id.video_view);
        View A022 = C06560Yg.A02(view, R.id.loading_progress);
        View A023 = C06560Yg.A02(view, R.id.play_button);
        String str2 = null;
        if (!TextUtils.isEmpty(str) && (A002 = this.A04.A00(str)) != null) {
            str2 = A002.getAbsolutePath();
        }
        if (!TextUtils.isEmpty(str2)) {
            videoSurfaceView.setVideoPath(str2);
        }
        videoSurfaceView.A0B = new AnonymousClass9XN(A022);
        videoSurfaceView.A09 = new AnonymousClass9XM(A023);
        A023.setOnClickListener(new C204409pJ((Object) videoSurfaceView, 0, (Object) A023));
        if (z) {
            videoSurfaceView.start();
            i = 8;
        } else {
            i = 0;
        }
        A023.setVisibility(i);
    }

    public void B1z(ImageView imageView, C58572vT r5, String str, String str2) {
        try {
            Intent intent = C111095hX.A02(imageView.getContext()).getIntent();
            if (intent.hasExtra("flow_id") && intent.hasExtra("flow_message_version")) {
                Uri parse = Uri.parse(str);
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append(parse.getHost());
                A0o.append(parse.getPath());
                str2 = AnonymousClass000.A0X(parse.getQuery(), A0o);
            }
        } catch (Exception unused) {
        }
        ((C46562bq) this.A09.get()).A00(imageView, r5, str, str2);
    }

    public TextWatcher B9L(TextInputEditText textInputEditText, Integer num, String str, String str2) {
        if ((num.intValue() & 2) != 2) {
            return new C195409Xr(textInputEditText, str);
        }
        if (str == null) {
            str = str2;
        }
        return new AnonymousClass98a(textInputEditText, str);
    }

    public void Bnp(View view, long j) {
        C18300x5.A0G(view, R.id.timer_text).setText(C107565bW.A0A(this.A06, j));
    }

    public void BrG(View view) {
        BloksVideoPlayerView bloksVideoPlayerView = (BloksVideoPlayerView) view.findViewById(R.id.video_player_view);
        C138386qG r0 = bloksVideoPlayerView.A09;
        if (r0 != null) {
            r0.A0G();
        }
        ViewTreeObserver.OnScrollChangedListener onScrollChangedListener = bloksVideoPlayerView.A00;
        if (onScrollChangedListener != null) {
            bloksVideoPlayerView.getViewTreeObserver().removeOnScrollChangedListener(onScrollChangedListener);
        }
        bloksVideoPlayerView.A00 = null;
    }

    public void BrI(View view) {
        C18300x5.A0G(view, R.id.start_message).setText("");
        C18300x5.A0G(view, R.id.timer_text).setText("");
    }

    public void BrJ(View view) {
        VideoSurfaceView videoSurfaceView = (VideoSurfaceView) C06560Yg.A02(view, R.id.video_view);
        videoSurfaceView.A00();
        MediaPlayer mediaPlayer = videoSurfaceView.A0C;
        if (mediaPlayer != null) {
            mediaPlayer.reset();
            videoSurfaceView.A0C.release();
            videoSurfaceView.A0C = null;
            videoSurfaceView.A02 = 0;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0024, code lost:
        if (r1 == false) goto L_0x0026;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Axx(android.content.Context r5, android.view.View r6, X.C15790rw r7, X.C15790rw r8, X.C15790rw r9, java.lang.Integer r10, java.lang.Integer r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, int r15, boolean r16) {
        /*
            r4 = this;
            android.app.Activity r0 = X.C111095hX.A02(r5)
            android.view.Window r1 = r0.getWindow()
            r0 = 8192(0x2000, float:1.14794E-41)
            r1.setFlags(r0, r0)
            r0 = 2131428802(0x7f0b05c2, float:1.8479259E38)
            android.view.View r3 = r6.findViewById(r0)
            com.whatsapp.CodeInputField r3 = (com.whatsapp.CodeInputField) r3
            if (r3 != 0) goto L_0x004a
            r2 = 0
            if (r12 == 0) goto L_0x0026
            java.lang.String r0 = "fb_pay"
            boolean r1 = r12.equals(r0)
            r0 = 2131624363(0x7f0e01ab, float:1.8875904E38)
            if (r1 != 0) goto L_0x0029
        L_0x0026:
            r0 = 2131624362(0x7f0e01aa, float:1.8875902E38)
        L_0x0029:
            android.view.View r3 = android.view.View.inflate(r5, r0, r2)
            com.whatsapp.CodeInputField r3 = (com.whatsapp.CodeInputField) r3
            X.9Xs r0 = new X.9Xs
            r0.<init>(r4)
            r3.setCustomSelectionActionModeCallback(r0)
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            r6.addView(r3)
            X.9a1 r1 = new X.9a1
            r1.<init>(r8, r9)
            if (r11 == 0) goto L_0x00b9
            int r0 = r11.intValue()
            r3.A0B(r1, r15, r0)
        L_0x004a:
            if (r10 == 0) goto L_0x0053
            int r0 = r10.intValue()
            r3.setGravity(r0)
        L_0x0053:
            r2 = 0
            if (r14 == 0) goto L_0x00b5
            java.lang.String r0 = "error"
            boolean r0 = r14.equals(r0)
            if (r0 == 0) goto L_0x00b5
            r0 = 1
            r3.setErrorState(r0)
            r3.A09()
            java.lang.String r0 = "no_error"
            r7.AwB(r0)
            X.5eA r0 = r3.A04
            r3.removeTextChangedListener(r0)
            X.9a1 r1 = new X.9a1
            r1.<init>(r8, r9)
            if (r11 == 0) goto L_0x00b1
            int r0 = r11.intValue()
            r3.A0B(r1, r15, r0)
        L_0x007d:
            r1 = r16
            r3.setEnabled(r1)
            r3.setCursorVisible(r2)
            if (r14 != 0) goto L_0x0096
            if (r13 == 0) goto L_0x0096
            java.lang.String r0 = r3.getCode()
            boolean r0 = r13.equals(r0)
            if (r0 != 0) goto L_0x0096
            r3.setCode(r13)
        L_0x0096:
            if (r16 == 0) goto L_0x00bd
            r3.requestFocus()
            java.lang.Object r2 = r3.getTag()
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            if (r2 != 0) goto L_0x00ab
            X.9hQ r2 = new X.9hQ
            r2.<init>(r3, r4)
            r3.setTag(r2)
        L_0x00ab:
            r0 = 0
            r3.postDelayed(r2, r0)
            return
        L_0x00b1:
            r3.A0A(r1, r15)
            goto L_0x007d
        L_0x00b5:
            r3.setErrorState(r2)
            goto L_0x007d
        L_0x00b9:
            r3.A0A(r1, r15)
            goto L_0x004a
        L_0x00bd:
            r3.A09()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C196199aS.Axx(android.content.Context, android.view.View, X.0rw, X.0rw, X.0rw, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, int, boolean):void");
    }

    public void Axz(Context context, View view, C150957Sw r19, String str, String str2, String str3, String str4, String str5, int i, long j, boolean z, boolean z2) {
        Long l;
        Number number;
        String str6;
        View view2 = view;
        TextInputEditText textInputEditText = (TextInputEditText) C06560Yg.A02(view2, R.id.hintOrDate);
        TextInputLayout textInputLayout = (TextInputLayout) C06560Yg.A02(view2, R.id.inputView);
        String str7 = str;
        if (str != null) {
            textInputLayout.setHint((CharSequence) str7);
            if ("wa_flows".equals(str5)) {
                boolean BIl = AnonymousClass0K7.A01.BIl(str7, 0, str7.length());
                int A002 = AnonymousClass0I0.A00(Locale.getDefault());
                if (!BIl ? A002 == 1 : A002 != 1) {
                    textInputEditText.setGravity(8388613);
                }
            }
        }
        Calendar instance = Calendar.getInstance();
        if (!TextUtils.isEmpty(str2)) {
            Date A003 = AnonymousClass9UC.A00(str2);
            if (A003 != null) {
                C626936e.A06(A003);
                textInputEditText.setText(DateFormat.getDateInstance(1).format(A003));
                instance.setTime(A003);
            }
        } else {
            long j2 = j;
            if (j > 0) {
                Date date = new Date(j2);
                C626936e.A06(date);
                textInputEditText.setText(DateFormat.getDateInstance(1).format(date));
                instance.setTime(date);
            } else if (i != 0) {
                instance.set(1, instance.get(1) + i);
            }
        }
        C150957Sw r6 = r19;
        AnonymousClass9X1 r11 = new AnonymousClass9X1(r6);
        boolean z3 = z;
        textInputLayout.setEnabled(z3);
        textInputEditText.setEnabled(z3);
        textInputEditText.setClickable(z3);
        String str8 = str3;
        try {
            l = C18290x4.A0h(str8);
        } catch (NumberFormatException unused) {
            C18260x0.A0r("WaBkComponentConfiguratorImpl/WaDatePicker/bind Max date is not a valid date format", str8, AnonymousClass001.A0o());
            l = null;
        }
        String str9 = str4;
        try {
            str6 = str9;
            Number A0h = C18290x4.A0h(str9);
            str6 = A0h;
            number = A0h;
        } catch (NumberFormatException unused2) {
            C18260x0.A0r("WaBkComponentConfiguratorImpl/WaDatePicker/bind Min date is not a valid date format", str6, AnonymousClass001.A0o());
            number = null;
        }
        if (z) {
            boolean z4 = z2;
            A00(textInputEditText, textInputLayout, z4);
            AnonymousClass94W r10 = new AnonymousClass94W((DatePickerDialog.OnDateSetListener) r11, context, instance.get(1), instance.get(2), instance.get(5));
            if (l != null) {
                r10.A01.setMaxDate(l.longValue());
            }
            if (number != null) {
                r10.A01.setMinDate(number.longValue());
            }
            C204249p3.A02(textInputEditText, r10, 0);
            textInputEditText.addTextChangedListener(new C195399Xq(textInputEditText, textInputLayout, this, z4));
            textInputLayout.setEndIconOnClickListener(C204249p3.A00(r6, 1));
            return;
        }
        textInputEditText.setOnClickListener((View.OnClickListener) null);
    }
}
