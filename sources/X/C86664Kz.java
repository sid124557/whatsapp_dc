package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Handler;
import android.os.Parcel;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaImageButton;
import com.whatsapp.WaImageView;
import com.whatsapp.calling.callrating.viewmodel.CallRatingViewModel;
import com.whatsapp.calling.service.VoiceServiceEventCallback;
import com.whatsapp.components.button.ThumbnailButton;
import com.whatsapp.emoji.EmojiDescriptor;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.textstatuscomposer.bottombar.CreationModeBottomBar;
import com.whatsapp.util.Log;
import java.lang.ref.Reference;
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.4Kz  reason: invalid class name and case insensitive filesystem */
public final class C86664Kz {
    public static float A00(float f, float f2, float f3) {
        return Math.min(f3, f / f2);
    }

    public static int A03(int i) {
        return i == 0 ? 8 : 0;
    }

    public static int A04(int i) {
        return i != 0 ? 5 : 3;
    }

    public static int A07(Intent intent, String str) {
        return intent.getIntExtra(str, -1);
    }

    public static long A0N(C157857j0 r1) {
        return EmojiDescriptor.A00(r1, false);
    }

    public static ValueAnimator A0P(float[] fArr, float f) {
        fArr[1] = f;
        return ValueAnimator.ofFloat(fArr);
    }

    public static ValueAnimator A0Q(int[] iArr, int i) {
        iArr[1] = i;
        return ValueAnimator.ofInt(iArr);
    }

    public static TypedArray A0X(Context context, AttributeSet attributeSet, int[] iArr) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        C162457s7.A0D(obtainStyledAttributes);
        return obtainStyledAttributes;
    }

    public static RectF A0b(float f, float f2) {
        return new RectF(0.0f, 0.0f, f, f2);
    }

    public static View A0g(LayoutInflater layoutInflater, int i) {
        return layoutInflater.inflate(i, (ViewGroup) null, false);
    }

    public static View A0h(LayoutInflater layoutInflater, ViewGroup viewGroup, int i) {
        return layoutInflater.inflate(i, viewGroup, true);
    }

    public static FrameLayout.LayoutParams A0p() {
        return new FrameLayout.LayoutParams(-2, -2);
    }

    public static FrameLayout.LayoutParams A0q() {
        return new FrameLayout.LayoutParams(-1, -1);
    }

    public static AnonymousClass0AN A0x(CreationModeBottomBar creationModeBottomBar) {
        AnonymousClass0AN r2 = new AnonymousClass0AN(3);
        r2.A07(300);
        r2.A09(creationModeBottomBar.A03);
        r2.A09(creationModeBottomBar.A0D);
        r2.A09(creationModeBottomBar.A0A);
        r2.A08(new DecelerateInterpolator());
        return r2;
    }

    public static void A1Q(View view, C05650Ui r9, int i) {
        r9.A0G(new AnonymousClass0KP(AccessibilityNodeInfo.CollectionItemInfo.obtain(0, 1, i, 1, false, view.isSelected())));
        if (view.isSelected()) {
            r9.A0H(false);
            r9.A08(C06220Ws.A08);
        }
    }

    public static int[] A1Z() {
        return new int[2];
    }

    public static int[] A1a(int i) {
        int[] iArr = new int[2];
        iArr[0] = i;
        return iArr;
    }

    public static Animator[] A1b(Object obj, Object obj2, int i, int i2) {
        Animator[] animatorArr = new Animator[i];
        animatorArr[i2] = obj;
        animatorArr[1] = obj2;
        return animatorArr;
    }

    public static int A05(int i) {
        return View.MeasureSpec.makeMeasureSpec(i, 1073741824);
    }

    public static int A06(long j) {
        return (int) (j >>> 32);
    }

    public static int A0A(View view) {
        if (view != null) {
            view.setVisibility(8);
        }
        return 8;
    }

    public static int A0H(C56892sj r0, C28011fL r1) {
        return r0.A09.A04(r1);
    }

    public static int A0I(C56952sp r1) {
        return r1.A0N(2614);
    }

    public static int A0J(C56952sp r1) {
        return r1.A0N(3153);
    }

    public static AnimatorSet A0O() {
        return new AnimatorSet();
    }

    public static Context A0T(C05570Ua r0) {
        return r0.A0H.getContext();
    }

    public static ColorStateList A0W(int[] iArr, int[][] iArr2, int i, int i2) {
        iArr[i2] = i;
        return new ColorStateList(iArr2, iArr);
    }

    public static Bitmap A0Y(int i, int i2) {
        return Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
    }

    public static Paint A0Z() {
        return new Paint();
    }

    public static Paint A0a(int i) {
        return new Paint(i);
    }

    public static C48952fk A17(C64333Db r0) {
        return (C48952fk) r0.A3e.get();
    }

    public static C56512s6 A18(C64333Db r0) {
        return (C56512s6) r0.AK3.get();
    }

    public static C50932j0 A1A(C64333Db r0) {
        return (C50932j0) r0.AGP.get();
    }

    public static C627736r A1B() {
        return new C627736r();
    }

    public static GroupJid A1C(AnonymousClass3ZH r1) {
        return (GroupJid) r1.A0I(GroupJid.class);
    }

    public static C621233o A1D(C64333Db r0) {
        return (C621233o) r0.AJA.get();
    }

    public static String A1L(String str) {
        return str.toUpperCase(Locale.US);
    }

    public static StringBuilder A1N(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        String str3 = C58172up.A0K;
        C162457s7.A0F(str3);
        sb.append(str3);
        sb.append("/");
        sb.append(str);
        sb.append("?");
        sb.append("access_token=");
        sb.append(str2);
        sb.append("&format=json");
        return sb;
    }

    public static Calendar A1O() {
        Calendar instance = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        instance.clear();
        return instance;
    }

    public static void A1R(ImageView imageView) {
        imageView.setScaleType(ImageView.ScaleType.CENTER);
    }

    public static void A1S(TextView textView) {
        textView.setEllipsize(TextUtils.TruncateAt.END);
    }

    public static void A1T(TextView textView, CharSequence charSequence) {
        textView.setText(charSequence, TextView.BufferType.SPANNABLE);
    }

    public static boolean A1X(C624134x r0, Object obj) {
        return obj.equals(r0.A1J);
    }

    public static float A01(Resources resources, int i) {
        return (float) resources.getDimensionPixelSize(i);
    }

    public static float A02(View view) {
        return (float) view.getHeight();
    }

    public static int A08(SharedPreferences sharedPreferences, String str, int i) {
        return sharedPreferences.getInt(str, i) + 1;
    }

    public static int A09(Resources resources, int i, int i2) {
        return i2 - resources.getDimensionPixelSize(i);
    }

    public static int A0B(View view) {
        return view.getWidth() / 2;
    }

    public static int A0C(View view, int i) {
        return i + view.getHeight();
    }

    public static int A0D(View view, int i) {
        return i - view.getHeight();
    }

    public static int A0E(View view, int i) {
        return view.getWidth() / i;
    }

    public static int A0F(View view, int i) {
        return i + view.getPaddingLeft();
    }

    public static int A0G(View view, int i) {
        return i + view.getMeasuredWidth();
    }

    public static int A0K(Number number) {
        C626936e.A06(number);
        return number.intValue();
    }

    public static int A0L(String str, int i) {
        return str.length() + i;
    }

    public static int A0M(AbstractCollection abstractCollection) {
        return abstractCollection.size() - 1;
    }

    public static Application.ActivityLifecycleCallbacks A0R(Iterator it) {
        return (Application.ActivityLifecycleCallbacks) it.next();
    }

    public static Context A0S(View view) {
        return view.getContext();
    }

    public static Context A0U(Reference reference) {
        return (Context) reference.get();
    }

    public static ColorStateList A0V(Context context, int i) {
        return ColorStateList.valueOf(AnonymousClass0Y8.A04(context, i));
    }

    public static Uri A0c(Iterator it) {
        return (Uri) it.next();
    }

    public static Handler A0d(VoiceServiceEventCallback voiceServiceEventCallback, String str) {
        Log.i(str);
        return voiceServiceEventCallback.voiceService.A0H;
    }

    public static Parcel A0e(C163177tO r1, int i) {
        return r1.A01(i, r1.A00());
    }

    public static Display A0f(Activity activity) {
        return activity.getWindowManager().getDefaultDisplay();
    }

    public static View A0i(View view) {
        return view.findViewById(16908298);
    }

    public static View A0j(Reference reference) {
        return (View) reference.get();
    }

    public static ViewGroup A0k(Activity activity, int i) {
        return (ViewGroup) C005205m.A00(activity, i);
    }

    public static ViewGroup A0l(View view) {
        return (ViewGroup) view.getParent();
    }

    public static ViewGroup A0m(C009707r r0, int i) {
        return (ViewGroup) r0.findViewById(i);
    }

    public static ViewStub A0n(View view, int i) {
        return (ViewStub) view.findViewById(i);
    }

    public static ViewStub A0o(C009707r r0, int i) {
        return (ViewStub) r0.findViewById(i);
    }

    public static FrameLayout.LayoutParams A0r(View view) {
        return (FrameLayout.LayoutParams) view.getLayoutParams();
    }

    public static FrameLayout A0s(View view, int i) {
        return (FrameLayout) view.findViewById(i);
    }

    public static ImageButton A0t(View view, int i) {
        return (ImageButton) C06560Yg.A02(view, i);
    }

    public static ImageView A0u(Activity activity, int i) {
        return (ImageView) C005205m.A00(activity, i);
    }

    public static LinearLayout A0v(View view, int i) {
        return (LinearLayout) view.findViewById(i);
    }

    public static RecyclerView A0w(View view, int i) {
        return (RecyclerView) view.findViewById(i);
    }

    public static C89654ea A0y(C08310eF r0) {
        return (C89654ea) r0.A0R();
    }

    public static TextEmojiLabel A0z(C009707r r0, int i) {
        return (TextEmojiLabel) r0.findViewById(i);
    }

    public static WaImageButton A10(View view, int i) {
        return (WaImageButton) C06560Yg.A02(view, i);
    }

    public static WaImageView A11(View view, int i) {
        return (WaImageView) view.findViewById(i);
    }

    public static C109015dw A12(Iterator it) {
        return (C109015dw) it.next();
    }

    public static C102995Lb A13(Iterator it) {
        return (C102995Lb) it.next();
    }

    public static CallRatingViewModel A14(AnonymousClass66R r0) {
        return (CallRatingViewModel) r0.getValue();
    }

    public static AnonymousClass4VK A15(Iterator it) {
        return (AnonymousClass4VK) it.next();
    }

    public static ThumbnailButton A16(View view, int i) {
        return (ThumbnailButton) C06560Yg.A02(view, i);
    }

    public static C623534r A19(Iterator it) {
        return (C623534r) it.next();
    }

    public static C186068uh A1E(C08310eF r0) {
        return (C186068uh) r0.A0Q();
    }

    public static C105425Uw A1F(Iterator it) {
        return (C105425Uw) it.next();
    }

    public static C106035Xj A1G(C183538qC r0) {
        return (C106035Xj) r0.get();
    }

    public static C624134x A1H(C06270Wx r0) {
        return (C624134x) r0.A07();
    }

    public static Long A1I(AtomicLong atomicLong) {
        return Long.valueOf(atomicLong.get());
    }

    public static String A1J(Intent intent, String str) {
        String stringExtra = intent.getStringExtra(str);
        C626936e.A06(stringExtra);
        return stringExtra;
    }

    public static String A1K(TextView textView) {
        return textView.getText().toString();
    }

    public static String A1M(AbstractList abstractList, int i) {
        return (String) abstractList.get(i);
    }

    public static Collection A1P(C06270Wx r0) {
        return (Collection) r0.A07();
    }

    public static boolean A1U(View view, Object obj) {
        return obj.equals(view.getTag());
    }

    public static boolean A1V(TextView textView) {
        return TextUtils.isEmpty(textView.getText());
    }

    public static boolean A1W(C56972sr r0) {
        return !r0.A0Y();
    }

    public static boolean A1Y(String str) {
        return str.trim().isEmpty();
    }
}
