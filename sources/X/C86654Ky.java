package X;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.media.audiofx.AudioEffect;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.widget.AbsListView;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.chip.Chip;
import com.whatsapp.R;
import com.whatsapp.bridge.wfal.WfalManager;
import com.whatsapp.chatinfo.view.custom.CollapsingProfilePhotoView;
import com.whatsapp.components.SelectionCheckView;
import com.whatsapp.conversationslist.ConversationsFragment;
import com.whatsapp.status.playback.fragment.StatusPlaybackBaseFragment;
import com.whatsapp.stickers.store.StickerStoreTabFragment;
import com.whatsapp.wds.components.button.WDSButton;
import java.math.BigDecimal;
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* renamed from: X.4Ky  reason: invalid class name and case insensitive filesystem */
public final class C86654Ky {
    public static int A00(int i) {
        if (i == 1) {
            return 270;
        }
        if (i != 3) {
            return i * 90;
        }
        return 90;
    }

    public static int A01(int i) {
        return i != 0 ? 3 : 1;
    }

    public static View A0G(Context context, int i) {
        return View.inflate(context, i, (ViewGroup) null);
    }

    public static BigDecimal A0p(C160617ny r2, AnonymousClass36K r3) {
        String A0n;
        if (r3 == null || (A0n = r3.A0n()) == null || r2 == null) {
            return null;
        }
        return C57952uT.A00(r2, Long.parseLong(A0n));
    }

    public static void A10(Drawable drawable, View view, int i) {
        int width = (view.getWidth() - i) / 2;
        int height = (view.getHeight() - i) / 2;
        if (drawable instanceof C86744Lj) {
            drawable.setBounds(0, 0, view.getWidth(), view.getHeight());
        } else {
            drawable.setBounds(width, height, width + i, i + height);
        }
    }

    public static void A13(View view) {
        AnonymousClass0YY.A0E(view, 64, (Bundle) null);
    }

    public static void A1B(AbsListView absListView, int i, int i2) {
        absListView.setTranscriptMode(0);
        absListView.setSelectionFromTop(i, i2);
    }

    public static void A1F(TextView textView) {
        textView.setSingleLine(false);
        textView.setMaxLines(2);
    }

    public static boolean A1S(Intent intent, String str) {
        if (intent == null || !intent.hasExtra(str)) {
            return false;
        }
        return intent.getBooleanExtra(str, false);
    }

    public static boolean A1T(SharedPreferences sharedPreferences, String str) {
        return sharedPreferences.getBoolean(str, true);
    }

    public static boolean A1U(View view) {
        return view.getVisibility() == 0;
    }

    public static boolean A1V(CollapsingProfilePhotoView collapsingProfilePhotoView) {
        collapsingProfilePhotoView.A04 = -1;
        collapsingProfilePhotoView.A00 = -1.0f;
        collapsingProfilePhotoView.A05 = 0;
        collapsingProfilePhotoView.A03 = 0;
        collapsingProfilePhotoView.A02 = 0;
        collapsingProfilePhotoView.A0C = true;
        return false;
    }

    public static boolean A1a(Object obj) {
        C162457s7.A0J(obj, 2);
        return false;
    }

    public static float[] A1b(float f) {
        float[] fArr = new float[2];
        fArr[0] = f;
        return fArr;
    }

    public static long A07(ValueAnimator valueAnimator, View view, int i, int i2) {
        valueAnimator.addUpdateListener(new AnonymousClass2AP(view, i));
        if (i2 != 0) {
            return 1400;
        }
        return 0;
    }

    public static long A08(AnonymousClass2NF r0, int i, long j) {
        if (i == 0) {
            return -1;
        }
        return j - r0.A01;
    }

    public static long A09(TimeUnit timeUnit) {
        return timeUnit.toMillis(1);
    }

    public static Intent A0C(Context context, int i) {
        Intent className = new Intent().setClassName(context.getPackageName(), "com.whatsapp.contact.picker.invite.InviteNonWhatsAppContactPickerActivity");
        className.putExtra("invite_source", i);
        return className;
    }

    public static Intent A0D(Intent intent) {
        return intent.putExtra("args_conversation_screen_entry_point", 1).putExtra("extra_show_search_on_create", true);
    }

    public static Drawable A0F(Drawable drawable, C181298mX r3, C59862xc r4) {
        if (r4.A00.A0X(1257)) {
            return new C86824Lz(drawable, r3);
        }
        return new AnonymousClass4M0(drawable, r3);
    }

    public static FrameLayout A0K(Context context, View view) {
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(view);
        return frameLayout;
    }

    public static C29291ia A0S(C64333Db r0) {
        return (C29291ia) r0.A3w.get();
    }

    public static C56962sq A0T(C64333Db r0) {
        return (C56962sq) r0.A2b.get();
    }

    public static WfalManager A0U(C64333Db r0) {
        return (WfalManager) r0.AbR.get();
    }

    public static C106995aW A0V(C64333Db r0) {
        return (C106995aW) r0.A4q.get();
    }

    public static C64653Ej A0X(C64333Db r0) {
        return (C64653Ej) r0.A5c.get();
    }

    public static AnonymousClass33K A0Y(C64333Db r0) {
        return (AnonymousClass33K) r0.AaW.get();
    }

    public static C53202mi A0Z(C64333Db r0) {
        return (C53202mi) r0.AXV.get();
    }

    public static AnonymousClass5LT A0c(StatusPlaybackBaseFragment statusPlaybackBaseFragment) {
        AnonymousClass5LT r1 = statusPlaybackBaseFragment.A04;
        C626936e.A07(r1, "getViewHolder() is accessed before StatusPlaybackBaseFragment#onCreateView()");
        return r1;
    }

    public static C50612iT A0d(StickerStoreTabFragment stickerStoreTabFragment, int i) {
        return (C50612iT) stickerStoreTabFragment.A0F.get(i);
    }

    public static C33141sV A0e(C64333Db r0) {
        return (C33141sV) r0.AMe.get();
    }

    public static String A0l(TextPaint textPaint, CharSequence charSequence, float f) {
        return TextUtils.ellipsize(charSequence, textPaint, f, TextUtils.TruncateAt.END).toString();
    }

    public static List A0q(Iterable iterable, int i) {
        return C73723fy.A0L(iterable, new AnonymousClass91S(i));
    }

    public static void A0u(Dialog dialog, Object obj, int i) {
        dialog.setOnDismissListener(new AnonymousClass91X(obj, i));
    }

    public static void A0v(Context context, String str) {
        context.startActivity(new Intent(str));
    }

    public static void A14(View view, int i, int i2) {
        view.setLayoutParams(new LinearLayout.LayoutParams(i, i2));
    }

    public static void A17(View view, ViewGroup viewGroup, int i, int i2) {
        viewGroup.addView(view, new FrameLayout.LayoutParams(i, i, i2));
    }

    public static void A19(View view, Object obj, int i) {
        view.setOnTouchListener(new C159677mH(obj, i));
    }

    public static void A1A(View view, String str, String str2, boolean z) {
        C06560Yg.A0O(view, new AnonymousClass4TD(view, str, str2, z));
    }

    public static void A1G(C15910sA r1, C06270Wx r2, int i) {
        r2.A0B(r1, new AnonymousClass4K2(r1, i));
    }

    public static void A1H(C06270Wx r1) {
        r1.A0H(Boolean.TRUE);
    }

    public static void A1I(RecyclerView recyclerView, C620733j r2, int i) {
        recyclerView.A0o(new AnonymousClass127(r2, i));
    }

    public static void A1K(C621033m r1, C624134x r2, C624134x r3) {
        r1.A1a.A00(r2, r3);
        r1.A0O(r2);
        r1.A0l.A0V(r2);
    }

    public static void A1N(C184558s8 r1, Object obj, Object obj2) {
        r1.BS1(new Pair(obj, obj2));
    }

    public static void A1O(C72173dI r1, Object obj, Object obj2, Object obj3, int i) {
        r1.execute(new C70323aJ(obj, obj2, obj3, i));
    }

    public static void A1P(Object obj, Object obj2, Object obj3) {
        C162457s7.A0J(obj, 14);
        C162457s7.A0J(obj2, 20);
        C162457s7.A0J(obj3, 22);
    }

    public static boolean A1W(ConversationsFragment conversationsFragment) {
        return conversationsFragment.A2j.A01.A0X(6202);
    }

    public static boolean A1X(C620633i r0, String str) {
        return r0.A0N.A00.getPackageManager().hasSystemFeature(str);
    }

    public static boolean A1Y(AnonymousClass3ZH r0) {
        return C627336j.A0L(r0.A0H);
    }

    public static boolean A1Z(C56952sp r2) {
        return r2.A0Y(C58422vE.A01, 3637);
    }

    public static int A02(Resources resources, int i, int i2) {
        return i2 + resources.getDimensionPixelSize(i);
    }

    public static int A03(Drawable drawable) {
        return drawable.getBounds().height();
    }

    public static int A04(View view) {
        return view.getHeight() / 2;
    }

    public static int A05(View view) {
        return view.getResources().getDimensionPixelOffset(R.dimen.f6nameremoved);
    }

    public static int A06(List list, int i) {
        return Math.min(i, list.size());
    }

    public static Animator A0A(View view, int i, int i2, float f, float f2) {
        Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view, i, i2, f, f2);
        createCircularReveal.setDuration(250);
        return createCircularReveal;
    }

    public static Context A0B(View view, TextView textView, int i) {
        textView.setText(i);
        return view.getContext();
    }

    public static BitmapDrawable A0E(Context context, Bitmap bitmap) {
        return new BitmapDrawable(context.getResources(), bitmap);
    }

    public static View A0H(Iterator it) {
        return (View) it.next();
    }

    public static ViewPropertyAnimator A0I(View view, long j) {
        return view.animate().setDuration(j);
    }

    public static Window A0J(C08310eF r0) {
        return r0.A0R().getWindow();
    }

    public static FrameLayout A0L(View view, int i) {
        return (FrameLayout) C06560Yg.A02(view, i);
    }

    public static ImageView A0M(C009707r r0, int i) {
        return (ImageView) r0.findViewById(i);
    }

    public static LinearLayout A0N(View view, int i) {
        return (LinearLayout) C06560Yg.A02(view, i);
    }

    public static C003203q A0O(C08310eF r0) {
        C003203q A0Q = r0.A0Q();
        C626936e.A06(A0Q);
        return A0Q;
    }

    public static RecyclerView A0P(View view, int i) {
        return (RecyclerView) C06560Yg.A02(view, i);
    }

    public static Chip A0Q(View view) {
        return new Chip(view.getContext(), (AttributeSet) null);
    }

    public static AnonymousClass5Z8 A0R(C06270Wx r0) {
        Object A07 = r0.A07();
        C162457s7.A0H(A07);
        return (AnonymousClass5Z8) A07;
    }

    public static C56942so A0W(C64333Db r0) {
        return (C56942so) r0.A5V.get();
    }

    public static AnonymousClass3QO A0a(C56232re r1, C30471mV r2) {
        return r1.A01(r1.A00(r2));
    }

    public static C624134x A0b(Iterable iterable) {
        return (C624134x) C73723fy.A00(iterable);
    }

    public static WDSButton A0f(View view, int i) {
        return (WDSButton) C06560Yg.A02(view, i);
    }

    public static C56042rK A0g(C183538qC r0) {
        return (C56042rK) r0.get();
    }

    public static Double A0h(String str, JSONObject jSONObject) {
        return Double.valueOf(jSONObject.optDouble(str));
    }

    public static Number A0i(C06270Wx r0) {
        return (Number) r0.A07();
    }

    public static Object A0j(AbstractList abstractList, int i) {
        Object obj = abstractList.get(i);
        C162457s7.A0D(obj);
        return obj;
    }

    public static Object A0k(List list, int i) {
        return ((Pair) list.get(i)).first;
    }

    public static String A0m(C620733j r1, AnonymousClass3ZH r2) {
        return r1.A0I(AnonymousClass36P.A02(r2));
    }

    public static String A0n(Locale locale, String str, Object[] objArr) {
        String format = String.format(locale, str, objArr);
        C162457s7.A0D(format);
        return format;
    }

    public static StringBuilder A0o() {
        C626936e.A01();
        return new StringBuilder();
    }

    public static List A0r(List list) {
        List unmodifiableList = Collections.unmodifiableList(list);
        C162457s7.A0D(unmodifiableList);
        return unmodifiableList;
    }

    public static void A0s(Activity activity, int i, int i2) {
        C005205m.A00(activity, i).setVisibility(i2);
    }

    public static void A0t(Activity activity, AbstractCollection abstractCollection, int i) {
        abstractCollection.add(activity.findViewById(i));
    }

    public static void A0w(Context context, AbstractCollection abstractCollection, int i) {
        abstractCollection.add(context.getString(i));
    }

    public static void A0x(Intent intent, Collection collection) {
        intent.putStringArrayListExtra("jids", C627336j.A0A(collection));
    }

    public static void A0y(Resources resources, View view, ViewGroup.LayoutParams layoutParams, int i) {
        layoutParams.width = resources.getDimensionPixelSize(i);
        view.setLayoutParams(layoutParams);
    }

    public static void A0z(Canvas canvas, Paint paint, Path path, float f, float f2) {
        path.lineTo(f, f2);
        path.close();
        canvas.drawPath(path, paint);
    }

    public static void A11(AudioEffect audioEffect, String str, StringBuilder sb, int i) {
        sb.append(str);
        sb.append(audioEffect.getEnabled());
        sb.append(" on session id ");
        sb.append(i);
    }

    public static void A12(MenuItem menuItem, int i, int i2) {
        menuItem.setIcon(i).setShowAsAction(i2);
    }

    public static void A15(View view, int i, int i2, int i3) {
        view.setPadding(i, i2, i3, view.getPaddingBottom());
    }

    public static void A16(View view, View view2, View view3, int i, int i2) {
        view.setVisibility(i);
        view2.setVisibility(i2);
        view3.setVisibility(i2);
    }

    public static void A18(View view, SelectionCheckView selectionCheckView, int i) {
        view.setVisibility(i);
        selectionCheckView.A02.setVisibility(i);
        selectionCheckView.A0C.setVisibility(i);
    }

    public static void A1C(CompoundButton compoundButton) {
        compoundButton.setChecked(!compoundButton.isChecked());
    }

    public static void A1D(EditText editText, String str) {
        editText.setSelection(str.length());
    }

    public static void A1E(TextView textView) {
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    public static void A1J(C69263Wi r2) {
        r2.A0H(R.string.f11nameremoved, 0);
    }

    public static void A1L(AnonymousClass5Y6 r2, Set set) {
        r2.A07(!set.isEmpty(), set.size());
    }

    public static void A1M(C56952sp r1, AbstractMap abstractMap, int i) {
        abstractMap.put("ranking_logic_ver", r1.A0Q(i));
    }

    public static void A1Q(AbstractCollection abstractCollection, Iterator it) {
        abstractCollection.add(((C186058ug) it.next()).B3d());
    }

    public static void A1R(Set set, int i) {
        set.add(Integer.valueOf(i));
    }
}
