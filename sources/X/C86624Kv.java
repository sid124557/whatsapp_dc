package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.os.Bundle;
import android.os.Handler;
import android.text.Spanned;
import android.text.style.URLSpan;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.ViewTreeObserver;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.maps.model.LatLng;
import com.whatsapp.CircularProgressBar;
import com.whatsapp.QrImageView;
import com.whatsapp.R;
import com.whatsapp.businessdirectory.view.custom.FilterBottomSheetDialogFragment;
import com.whatsapp.calling.service.VoiceServiceEventCallback;
import com.whatsapp.conversation.conversationrow.ConversationRowVideo$RowVideoView;
import com.whatsapp.conversationslist.ConversationsFragment;
import com.whatsapp.gallerypicker.MediaPickerFragment;
import com.whatsapp.group.GroupCallButtonController;
import com.whatsapp.jid.UserJid;
import com.whatsapp.mediacomposer.doodle.DoodleView;
import com.whatsapp.voipcalling.CallInfo;
import java.text.DateFormat;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.concurrent.ThreadPoolExecutor;

/* renamed from: X.4Kv  reason: invalid class name and case insensitive filesystem */
public final class C86624Kv {
    public static Intent A07(Context context, int i) {
        Intent className = new Intent().setClassName(context.getPackageName(), "com.whatsapp.calling.callhistory.group.GroupCallParticipantPicker");
        className.putExtra("hidden_jids", 0);
        className.putExtra("call_from_ui", i);
        return className;
    }

    public static LinearLayout.LayoutParams A0C() {
        return new LinearLayout.LayoutParams(-2, -2);
    }

    public static C05550Ty A0D(C15940sD r2, Object obj, Object obj2, Object obj3) {
        return new AnonymousClass0XL((C17190ui) new C86124Ix(obj, obj2, obj3, 3), r2).A01(AnonymousClass10x.class);
    }

    public static ArrayList A0d(Collection collection) {
        C162457s7.A0J(collection, 0);
        return new ArrayList(collection);
    }

    public static void A13(View view, View view2) {
        view.setVisibility(0);
        view2.setVisibility(8);
    }

    public static void A15(View view, ViewGroup viewGroup) {
        viewGroup.addView(view, -1, -2);
    }

    public static void A1G(C107285b3 r7, CallInfo callInfo) {
        UserJid peerJid = callInfo.getPeerJid();
        C626936e.A06(peerJid);
        boolean z = callInfo.videoEnabled;
        C107285b3 r0 = r7;
        r0.A0W(callInfo.groupJid, peerJid, callInfo.callId, false, z, callInfo.isGroupCall);
    }

    public static void A1O(Object obj, int i, Object obj2) {
        C162457s7.A0J(obj, 0);
        C162457s7.A0J(obj2, i);
    }

    public static void A1U(float[] fArr, float f) {
        fArr[4] = f;
        fArr[5] = f;
        fArr[6] = f;
        fArr[7] = f;
    }

    public static boolean A1W(int i, int i2) {
        return i > i2;
    }

    public static URLSpan[] A1b(Spanned spanned) {
        return (URLSpan[]) spanned.getSpans(0, spanned.length(), URLSpan.class);
    }

    public static int A04(String str) {
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public static Intent A06(Context context, int i) {
        Intent className = new Intent().setClassName(context.getPackageName(), "com.whatsapp.blockinguserinteraction.BlockingUserInteractionActivity");
        className.putExtra("blocking_type", i);
        return className;
    }

    public static AttributeSet A09(AttributeSet attributeSet, int i) {
        if ((i & 2) != 0) {
            return null;
        }
        return attributeSet;
    }

    public static AnonymousClass0LC A0E(int i) {
        return new C05360Ta(new C188798zV(i)).A00();
    }

    public static C161877ql A0I(C161877ql r2, float f) {
        C158227jd r1 = new C158227jd(r2);
        r1.A01(f);
        return new C161877ql(r1);
    }

    public static C60842zG A0J(C56892sj r0, C28011fL r1, UserJid userJid) {
        return r0.A09.A07(r1).A05(userJid);
    }

    public static C620433g A0K(C64333Db r0) {
        return (C620433g) r0.A3v.get();
    }

    public static FilterBottomSheetDialogFragment A0L(AnonymousClass4CX r4, AnonymousClass7HE r5) {
        FilterBottomSheetDialogFragment filterBottomSheetDialogFragment = new FilterBottomSheetDialogFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("arg-categories", r5.A00);
        bundle.putParcelableArrayList("arg-selected-categories", r5.A01);
        filterBottomSheetDialogFragment.A0u(bundle);
        filterBottomSheetDialogFragment.A02 = r4;
        return filterBottomSheetDialogFragment;
    }

    public static AnonymousClass30B A0M(C64333Db r0) {
        return (AnonymousClass30B) r0.A2K.get();
    }

    public static C29301ib A0N(C64333Db r0) {
        return (C29301ib) r0.A57.get();
    }

    public static C106995aW A0O(ConversationsFragment conversationsFragment) {
        return (C106995aW) conversationsFragment.A31.get();
    }

    public static C613330g A0P(C64333Db r0) {
        return (C613330g) r0.A6S.get();
    }

    public static C57162tC A0R(C64333Db r0) {
        return (C57162tC) r0.AaV.get();
    }

    public static C29241iV A0T(C64333Db r0) {
        return (C29241iV) r0.AGn.get();
    }

    public static UserJid A0U(String str) {
        UserJid A0E = UserJid.Companion.A0E(str);
        C626936e.A06(A0E);
        return A0E;
    }

    public static Long A0Y(Number number) {
        return Long.valueOf(number.longValue() + 1);
    }

    public static String A0c(DateFormat dateFormat, long j) {
        return dateFormat.format(new Date(j));
    }

    public static void A0g(Context context, AttributeSet attributeSet, CircularProgressBar circularProgressBar) {
        circularProgressBar.A06 = 5.0f;
        circularProgressBar.A0I = false;
        circularProgressBar.A05 = 0.3f;
        circularProgressBar.A0E = new Rect();
        circularProgressBar.A08 = AnonymousClass0Y8.A04(context, R.color.f5nameremoved);
        circularProgressBar.A0C = AnonymousClass0Y8.A04(context, R.color.f5nameremoved);
        circularProgressBar.A0B = AnonymousClass0Y8.A04(context, R.color.f5nameremoved);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C100905Cs.A05);
            circularProgressBar.A0C = obtainStyledAttributes.getInteger(1, circularProgressBar.A0C);
            circularProgressBar.A0B = obtainStyledAttributes.getInteger(0, circularProgressBar.A0B);
            circularProgressBar.A09 = obtainStyledAttributes.getInteger(2, circularProgressBar.A09);
            circularProgressBar.A06 = obtainStyledAttributes.getFloat(5, circularProgressBar.A06);
            circularProgressBar.A0A = obtainStyledAttributes.getInteger(3, circularProgressBar.A0A);
            circularProgressBar.A03 = obtainStyledAttributes.getDimension(4, circularProgressBar.A03);
            circularProgressBar.A08 = obtainStyledAttributes.getInteger(6, circularProgressBar.A08);
            obtainStyledAttributes.recycle();
        }
    }

    public static void A0j(Intent intent) {
        intent.setType("text/plain");
        intent.addFlags(524288);
    }

    public static void A0m(Paint paint, ConversationRowVideo$RowVideoView conversationRowVideo$RowVideoView) {
        conversationRowVideo$RowVideoView.A06 = paint;
        conversationRowVideo$RowVideoView.A07 = new RectF();
        conversationRowVideo$RowVideoView.A0F = false;
        conversationRowVideo$RowVideoView.A01 = 0;
        conversationRowVideo$RowVideoView.A00 = 0;
        conversationRowVideo$RowVideoView.A0H = false;
        conversationRowVideo$RowVideoView.A05 = 0;
        conversationRowVideo$RowVideoView.A04 = 0;
        conversationRowVideo$RowVideoView.A01();
    }

    public static void A0o(Location location, LatLng latLng) {
        location.setLatitude(latLng.A00);
        location.setLongitude(latLng.A01);
    }

    public static void A0t(View view, int i) {
        view.setLayoutParams(new LinearLayout.LayoutParams(i, i));
    }

    public static void A0v(View view, int i) {
        view.setLayoutParams(new ViewGroup.LayoutParams(i, i));
    }

    public static void A0x(View view, int i) {
        view.setLayoutParams(new FrameLayout.LayoutParams(i, i));
    }

    public static void A10(View view, int i, int i2) {
        view.setLayoutParams(new FrameLayout.LayoutParams(i, i2));
    }

    public static void A11(View view, int i, int i2, int i3) {
        if (i != 0) {
            view.setVisibility(i2);
        } else {
            view.setVisibility(i3);
        }
    }

    public static void A12(View view, View view2) {
        view.setVisibility(8);
        view2.setVisibility(8);
    }

    public static void A19(Animation animation, Object obj, int i) {
        animation.setAnimationListener(new C188998zp(obj, i));
    }

    public static void A1D(C69263Wi r1, Object obj, int i) {
        r1.A0S(new C70023Zo(obj, i));
    }

    public static void A1E(QrImageView qrImageView) {
        if (!qrImageView.A07) {
            qrImageView.A07 = true;
            qrImageView.generatedComponent();
        }
        qrImageView.A01 = new Paint();
        qrImageView.A02 = new RectF();
    }

    public static void A1H(AnonymousClass3ZH r1, AbstractCollection abstractCollection) {
        abstractCollection.add(r1.A0I(C95814uZ.class));
    }

    public static void A1J(GroupCallButtonController groupCallButtonController) {
        AnonymousClass5GJ r0 = groupCallButtonController.A05;
        if (r0 != null) {
            r0.A00.A01();
        }
    }

    public static void A1K(C72173dI r1, Object obj, int i) {
        r1.execute(new C69973Zj(obj, i));
    }

    public static void A1L(AnonymousClass4FS r1, Object obj, int i) {
        r1.BkM(new C70033Zp(obj, i));
    }

    public static void A1M(AnonymousClass4FS r1, Object obj, Object obj2, int i) {
        r1.BkM(new C71653cS(obj, i, obj2));
    }

    public static void A1N(AnonymousClass4FS r1, Object obj, Object obj2, int i) {
        r1.BkM(new C70153a2(obj, i, obj2));
    }

    public static void A1P(Object obj, Object obj2, Object obj3, Object obj4) {
        C162457s7.A0J(obj, 25);
        C162457s7.A0J(obj2, 26);
        C162457s7.A0J(obj3, 27);
        C162457s7.A0J(obj4, 28);
    }

    public static void A1Q(Object obj, AbstractCollection abstractCollection, int i) {
        if ((i ^ 1) != 0) {
            abstractCollection.add(obj);
        }
    }

    public static void A1R(Object obj, AbstractMap abstractMap) {
        abstractMap.put(obj, new ArrayList());
    }

    public static void A1S(ThreadPoolExecutor threadPoolExecutor, int i) {
        threadPoolExecutor.execute(new C172578Lw(i));
    }

    public static boolean A1X(AnonymousClass3ZH r0, AnonymousClass3LP r1) {
        return C57362tW.A00(r1, r0.A0H);
    }

    public static int A00(Resources resources, C60842zG r3) {
        int[] intArray = resources.getIntArray(R.array.f2nameremoved);
        return intArray[r3.A00 % intArray.length];
    }

    public static int A01(View view) {
        return view.getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
    }

    public static int A02(View view, int i) {
        return AnonymousClass0Y8.A04(view.getContext(), i);
    }

    public static int A03(EditText editText) {
        return editText.getText().length();
    }

    public static long A05(C56952sp r2, int i) {
        return ((long) r2.A0N(i)) * 1048576;
    }

    public static Handler A08(DoodleView doodleView) {
        doodleView.A02();
        doodleView.A03 = -65536;
        doodleView.A01 = 8.0f;
        doodleView.A02 = 8.0f;
        return new Handler();
    }

    public static ViewPropertyAnimator A0A(View view) {
        return view.animate().alpha(0.0f);
    }

    public static ViewPropertyAnimator A0B(View view) {
        return view.animate().alpha(1.0f);
    }

    public static LatLng A0F(Location location) {
        return new LatLng(location.getLatitude(), location.getLongitude());
    }

    public static LatLng A0G(LatLng latLng, double d, double d2) {
        double radians = Math.toRadians(d);
        double radians2 = Math.toRadians(latLng.A00);
        double radians3 = Math.toRadians(latLng.A01);
        double cos = Math.cos(d2);
        double sin = Math.sin(d2);
        double sin2 = Math.sin(radians2);
        double cos2 = sin * Math.cos(radians2);
        double cos3 = (cos * sin2) + (Math.cos(radians) * cos2);
        return new LatLng(Math.toDegrees(Math.asin(cos3)), Math.toDegrees(radians3 + Math.atan2(cos2 * Math.sin(radians), cos - (sin2 * cos3))));
    }

    public static LatLng A0H(Number number, double d) {
        return new LatLng(d, number.doubleValue());
    }

    public static AnonymousClass5ST A0Q(C64333Db r0) {
        return (AnonymousClass5ST) r0.A6r.get();
    }

    public static AnonymousClass1VW A0S(C64333Db r0) {
        return (AnonymousClass1VW) r0.A03.get();
    }

    public static C619933b A0V(C64333Db r0) {
        return (C619933b) r0.ALS.get();
    }

    public static C106675Zy A0W(C64333Db r0) {
        return (C106675Zy) r0.A73.get();
    }

    public static Integer A0X(Resources resources, int i) {
        return Integer.valueOf((int) resources.getDimension(i));
    }

    public static Long A0Z(Iterator it) {
        return Long.valueOf(((C623534r) it.next()).A05());
    }

    public static String A0a(Resources resources, int i) {
        String string = resources.getString(i);
        C162457s7.A0D(string);
        return string;
    }

    public static String A0b(View view, int i) {
        return view.getContext().getString(i);
    }

    public static void A0e(int i, Paint paint) {
        paint.setColor(i);
        paint.setStyle(Paint.Style.STROKE);
    }

    public static void A0f(Activity activity) {
        activity.finish();
        activity.overridePendingTransition(0, 0);
    }

    public static void A0h(Context context, View view, Object[] objArr, int i) {
        view.setContentDescription(context.getString(i, objArr));
    }

    public static void A0i(Context context, C19340zH r1, Object[] objArr, int i) {
        r1.A0g(context.getString(i, objArr));
    }

    public static void A0k(Resources resources, Paint paint, int i) {
        paint.setColor(resources.getColor(i));
    }

    public static void A0l(Resources resources, View view, int i) {
        view.setBackgroundColor(resources.getColor(i));
    }

    public static void A0n(Drawable drawable, View view) {
        drawable.setBounds(0, 0, view.getWidth(), view.getHeight());
    }

    public static void A0p(Handler handler, VoiceServiceEventCallback voiceServiceEventCallback, int i) {
        handler.removeMessages(i);
        voiceServiceEventCallback.voiceService.A0H.sendEmptyMessage(i);
    }

    public static void A0q(MenuItem menuItem, int i) {
        menuItem.setIcon(i).setShowAsAction(2);
    }

    public static void A0r(View view) {
        view.setPadding(view.getPaddingLeft(), 0, view.getPaddingRight(), view.getPaddingBottom());
    }

    public static void A0s(View view) {
        view.animate().cancel();
    }

    public static void A0u(View view, int i) {
        view.findViewById(i).setVisibility(8);
    }

    public static void A0w(View view, int i) {
        view.getLayoutParams().height = i;
    }

    public static void A0y(View view, int i, int i2) {
        view.setPadding(i, view.getPaddingTop(), i2, view.getPaddingBottom());
    }

    public static void A0z(View view, int i, int i2) {
        View findViewById = view.findViewById(i);
        if (findViewById != null) {
            findViewById.setVisibility(i2);
        }
    }

    public static void A14(View view, View view2, View view3, int i) {
        view.setVisibility(i);
        view2.setVisibility(i);
        view3.setVisibility(i);
    }

    public static void A16(View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        view.getViewTreeObserver().removeGlobalOnLayoutListener(onGlobalLayoutListener);
    }

    public static void A17(View view, CharSequence charSequence, int i) {
        ((TextView) view.findViewById(i)).setText(charSequence);
    }

    public static void A18(Animation animation, long j) {
        animation.setDuration(j);
        animation.setInterpolator(new AccelerateInterpolator());
    }

    public static void A1A(EditText editText) {
        editText.setText(editText.getEditableText().append(System.getProperty("line.separator")));
        editText.setSelection(editText.getEditableText().length());
    }

    public static void A1B(ImageView imageView) {
        imageView.setImageDrawable(new ColorDrawable(-7829368));
    }

    public static void A1C(C06270Wx r2, boolean z) {
        Object A07 = r2.A07();
        Boolean valueOf = Boolean.valueOf(z);
        if (!AnonymousClass75J.A00(A07, valueOf)) {
            r2.A0H(valueOf);
        }
    }

    public static void A1F(C19340zH r1) {
        r1.A0U(R.string.f11nameremoved);
        r1.A0T(R.string.f11nameremoved);
    }

    public static void A1I(MediaPickerFragment mediaPickerFragment, int i) {
        mediaPickerFragment.A01 = i + (mediaPickerFragment.A1L().A0N(2693) - mediaPickerFragment.A1L().A0N(2614));
    }

    public static void A1T(AnonymousClass66R r0, int i) {
        ((View) r0.getValue()).setVisibility(i);
    }

    public static void A1V(Object[] objArr, int i) {
        objArr[i] = Integer.valueOf(i);
    }

    public static boolean A1Y(C56042rK r0, AnonymousClass21S r1) {
        return C162457s7.A0P(r0.A01(r1), Boolean.TRUE);
    }

    public static boolean A1Z(Throwable th) {
        return th.getMessage().contains("No space");
    }

    public static boolean A1a(AbstractCollection abstractCollection, int i) {
        return abstractCollection.contains(Integer.valueOf(i));
    }
}
