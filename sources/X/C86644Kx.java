package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Layout;
import android.text.Spannable;
import android.text.style.URLSpan;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.PopupWindow;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.DialogFragment;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.datepicker.MaterialCalendar;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaEditText;
import com.whatsapp.WaTextView;
import com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryContextualSearchViewModel;
import com.whatsapp.components.TextAndDateLayout;
import com.whatsapp.conversation.conversationrow.ConversationRowAudioPreview;
import com.whatsapp.conversation.conversationrow.TemplateQuickReplyButtonsLayout;
import com.whatsapp.jid.UserJid;
import com.whatsapp.mediacomposer.MediaComposerActivity;
import com.whatsapp.qrcode.QrEducationView;
import com.whatsapp.settings.chat.wallpaper.WallPaperView;
import com.whatsapp.voipcalling.CallInfo;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import org.json.JSONObject;

/* renamed from: X.4Kx  reason: invalid class name and case insensitive filesystem */
public final class C86644Kx {
    public static int A08(Object obj) {
        return obj == null ? 8 : 0;
    }

    public static Drawable A0D(View view, PopupWindow popupWindow, int i) {
        popupWindow.setTouchable(true);
        popupWindow.setFocusable(true);
        popupWindow.setOutsideTouchable(true);
        popupWindow.setInputMethodMode(2);
        Context context = view.getContext();
        if (i == 0) {
            return C107335b8.A04(context, R.drawable.panel, AnonymousClass5Yj.A02(view.getContext(), R.attr.f3nameremoved, R.color.f5nameremoved));
        }
        Drawable A00 = AnonymousClass0RP.A00(context, R.drawable.emoji_skin_popup_background);
        popupWindow.setElevation(4.0f);
        return A00;
    }

    public static View A0G(ViewGroup viewGroup) {
        return viewGroup.getChildAt(0);
    }

    public static CharSequence A0d(Context context, C620733j r7, C107075ae r8, CharSequence charSequence, List list) {
        AnonymousClass7IU A00 = C107075ae.A00(context, r7, r8, charSequence, list, false);
        if (A00 != null) {
            return (CharSequence) A00.A00;
        }
        return null;
    }

    public static void A0n(Context context, QrEducationView qrEducationView) {
        qrEducationView.A0D = false;
        qrEducationView.A0E = true;
        qrEducationView.A05 = new RectF();
        qrEducationView.A01(context);
    }

    public static void A0v(View.OnLayoutChangeListener onLayoutChangeListener, View view) {
        C162457s7.A0J(view, 0);
        view.removeOnLayoutChangeListener(onLayoutChangeListener);
    }

    public static void A15(View view, ConversationRowAudioPreview conversationRowAudioPreview) {
        view.setVisibility(0);
        conversationRowAudioPreview.A00.setVisibility(8);
    }

    public static void A1D(DialogFragment dialogFragment, C003203q r3) {
        dialogFragment.A1O(r3.getSupportFragmentManager(), (String) null);
    }

    public static void A1N(WallPaperView wallPaperView) {
        wallPaperView.A04 = false;
        wallPaperView.setImageDrawable((Drawable) null);
        wallPaperView.invalidate();
    }

    public static void A1W(LinkedList linkedList) {
        List A0G = C73723fy.A0G(C175708Zk.A02(0, 21));
        Collections.shuffle(A0G);
        linkedList.addAll(A0G);
        C118405tU.A00 = linkedList;
    }

    public static boolean A1a(AnonymousClass5ZM r1) {
        if (r1 != null) {
            r1.A0D(true);
        }
        return true;
    }

    public static int[] A1b() {
        return new int[]{R.string.f11nameremoved, R.string.f11nameremoved, R.string.f11nameremoved, R.string.f11nameremoved, R.string.f11nameremoved};
    }

    public static float A00(RectF rectF, JSONObject jSONObject) {
        rectF.left = ((float) jSONObject.getInt("l")) / 100.0f;
        rectF.top = ((float) jSONObject.getInt("t")) / 100.0f;
        rectF.right = ((float) jSONObject.getInt("r")) / 100.0f;
        rectF.bottom = ((float) jSONObject.getInt("b")) / 100.0f;
        return 100.0f;
    }

    public static int A03(Layout layout, TextAndDateLayout textAndDateLayout) {
        int i = textAndDateLayout.A02;
        if (i == 0) {
            return layout.getLineCount() - 1;
        }
        return Math.min(i - 1, layout.getLineCount() - 1);
    }

    public static int A06(CharSequence charSequence, int i) {
        return Math.min((i + Character.charCount(Character.codePointAt(charSequence, i - 1))) - 1, charSequence.length());
    }

    public static AnimatorSet A09(AnimatorSet animatorSet, Object obj, Animator[] animatorArr, int i) {
        animatorArr[i] = obj;
        animatorSet.playTogether(animatorArr);
        return new AnimatorSet();
    }

    public static Intent A0A(C08310eF r3) {
        Intent intent = new Intent();
        intent.putExtra("bucket_uri", r3.A0R().getIntent().getData());
        return intent;
    }

    public static AnonymousClass5Ul A0L(C64333Db r0) {
        return (AnonymousClass5Ul) r0.AUW.get();
    }

    public static AnonymousClass64J A0N(C64333Db r0) {
        return (AnonymousClass64J) r0.AEN.get();
    }

    public static C105145Tt A0P(C64333Db r0) {
        return (C105145Tt) r0.A4V.get();
    }

    public static C1230066r A0Q(C64333Db r0) {
        return (C1230066r) r0.A4Q.get();
    }

    public static C56422rx A0S(C64333Db r0) {
        return (C56422rx) r0.AZn.get();
    }

    public static C113905mB A0T(C64333Db r0) {
        return (C113905mB) r0.A4w.get();
    }

    public static C66473Lo A0U(C64333Db r0) {
        return (C66473Lo) r0.A6p.get();
    }

    public static C52472lX A0W(C64333Db r0) {
        return (C52472lX) r0.AXh.get();
    }

    public static C105255Ue A0a(C64333Db r0) {
        return (C105255Ue) r0.A2Q.get();
    }

    public static C105895Wv A0b(C64333Db r0) {
        return (C105895Wv) r0.AHN.get();
    }

    public static Class A0e(Object obj) {
        if (obj != null) {
            return obj.getClass();
        }
        return null;
    }

    public static void A0i(Animator animator) {
        animator.setInterpolator(new AccelerateDecelerateInterpolator());
    }

    public static void A0j(Animator animator) {
        animator.setInterpolator(new LinearInterpolator());
    }

    public static void A0o(ColorStateList colorStateList, Drawable drawable, int[] iArr, int[] iArr2, float f) {
        if (drawable != null) {
            AnonymousClass0YG.A06(drawable, AnonymousClass0YI.A03(f, colorStateList.getColorForState(iArr, 0), colorStateList.getColorForState(iArr2, 0)));
        }
    }

    public static void A0q(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback((Drawable.Callback) null);
        }
    }

    public static void A0t(Spannable spannable, String str, int i, int i2) {
        spannable.setSpan(new URLSpan(str), i, i2, 0);
    }

    public static void A13(View view, Animation animation) {
        animation.setDuration(100);
        view.startAnimation(animation);
    }

    public static void A17(Window window, int i) {
        window.setBackgroundDrawable(new ColorDrawable(i));
    }

    public static void A18(Animation animation) {
        animation.setDuration(125);
        animation.setStartOffset(100);
        animation.setInterpolator(new AccelerateDecelerateInterpolator());
    }

    public static void A1A(ImageView imageView) {
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
    }

    public static void A1B(C05650Ui r1, CharSequence charSequence, int i) {
        r1.A07(new C06220Ws(i, charSequence));
    }

    public static void A1E(C06270Wx r1, AnonymousClass7UM r2, int i, boolean z) {
        r1.A0H(new C152307Yj(r2, i, z));
    }

    public static void A1G(C117695sL r2, C107285b3 r3) {
        if (r3.A2o.A0X(2903)) {
            r3.A13.execute(r2);
        } else {
            r2.run();
        }
    }

    public static void A1I(MaterialCalendar materialCalendar, int i, int i2) {
        materialCalendar.A04.setVisibility(i);
        materialCalendar.A01.setVisibility(i2);
        materialCalendar.A03.setVisibility(i2);
        materialCalendar.A02.setVisibility(i2);
    }

    public static void A1J(WaEditText waEditText) {
        if (waEditText != null) {
            waEditText.A07(false);
        }
    }

    public static void A1K(C181788nK r1, int i) {
        r1.Bh3(new C64543Dx(i));
    }

    public static void A1L(BusinessDirectoryContextualSearchViewModel businessDirectoryContextualSearchViewModel, AbstractCollection abstractCollection) {
        C166447yh r0 = businessDirectoryContextualSearchViewModel.A05;
        if (r0 != null) {
            abstractCollection.add(new C136116ls(new C147137Cy(businessDirectoryContextualSearchViewModel), r0.A01));
        }
    }

    public static void A1M(C182248o6 r1, String str, AbstractCollection abstractCollection, int i, boolean z) {
        abstractCollection.add(new C149407Mi(r1, str, i, z));
    }

    public static void A1P(AnonymousClass5UY r1) {
        if (r1 != null) {
            r1.A06(8);
        }
    }

    public static void A1Q(AnonymousClass4FS r1, Object obj, int i) {
        r1.BkM(new C71543cH(obj, i));
    }

    public static void A1R(AnonymousClass4FS r1, Object obj, Object obj2, int i) {
        r1.BkM(new C70183a5(obj, i, obj2));
    }

    public static void A1S(AnonymousClass4FS r1, Object obj, Object obj2, int i) {
        r1.BkM(new C70103Zx(obj, i, obj2));
    }

    public static void A1T(Object obj, Object obj2, Object obj3, Object obj4, Object[] objArr) {
        objArr[33] = obj;
        objArr[34] = obj2;
        objArr[35] = obj3;
        objArr[36] = obj4;
    }

    public static void A1U(Object obj, Object obj2, Object obj3, Object obj4, Object[] objArr) {
        objArr[37] = obj;
        objArr[38] = obj2;
        objArr[39] = obj3;
        objArr[40] = obj4;
    }

    public static boolean A1Z(C56952sp r1) {
        return r1.A0X(1967);
    }

    public static int A01(Drawable drawable) {
        return drawable.getBounds().width();
    }

    public static int A02(Parcel parcel, Parcelable.Creator creator, AbstractCollection abstractCollection, int i) {
        abstractCollection.add(creator.createFromParcel(parcel));
        return i + 1;
    }

    public static int A04(C009707r r0, int i) {
        r0.findViewById(i).setVisibility(8);
        return 8;
    }

    public static int A05(C56532s8 r0) {
        return r0.A02().length();
    }

    public static int A07(Number number) {
        C162457s7.A0H(number);
        return number.intValue();
    }

    public static SharedPreferences A0B(C183538qC r0) {
        return ((AnonymousClass2ZB) r0.get()).A00();
    }

    public static Drawable A0C(View view, int i) {
        return AnonymousClass0RP.A00(view.getContext(), i);
    }

    public static Parcel A0E(IInterface iInterface, C163177tO r2) {
        Parcel A00 = r2.A00();
        C161087oy.A00(iInterface, A00);
        return A00;
    }

    public static View A0F(MenuItem menuItem, int i) {
        menuItem.setActionView(i);
        return menuItem.getActionView();
    }

    public static View A0H(AnonymousClass66R r0) {
        return (View) r0.getValue();
    }

    public static ViewGroup A0I(View view, int i) {
        return (ViewGroup) C06560Yg.A02(view, i);
    }

    public static ViewGroup A0J(View view, int i) {
        return (ViewGroup) view.findViewById(i);
    }

    public static Toolbar A0K(View view) {
        return (Toolbar) view.findViewById(R.id.toolbar);
    }

    public static TextEmojiLabel A0M(View view, int i) {
        return (TextEmojiLabel) view.findViewById(i);
    }

    public static WaTextView A0O(View view, int i) {
        return (WaTextView) view.findViewById(i);
    }

    public static C47882dz A0R(C64333Db r0) {
        return (C47882dz) r0.AIl.get();
    }

    public static C106095Xp A0V(C64333Db r0) {
        return (C106095Xp) r0.AG6.get();
    }

    public static UserJid A0X(CallInfo callInfo) {
        UserJid peerJid = callInfo.getPeerJid();
        C626936e.A06(peerJid);
        return peerJid;
    }

    public static MediaComposerActivity A0Y(C08310eF r0) {
        return (MediaComposerActivity) ((C186068uh) r0.A0Q());
    }

    public static C195219Wq A0Z(C64333Db r0) {
        return (C195219Wq) r0.AQK.get();
    }

    public static C111135hb A0c(C183538qC r0) {
        return (C111135hb) r0.get();
    }

    public static Long A0f(AbstractCollection abstractCollection) {
        return Long.valueOf((long) abstractCollection.size());
    }

    public static String A0g(EditText editText) {
        return String.valueOf(editText.getText());
    }

    public static List A0h(C06270Wx r0) {
        return (List) r0.A07();
    }

    public static void A0k(Activity activity, int i) {
        C005205m.A00(activity, i).setVisibility(8);
    }

    public static void A0l(Context context, ImageView imageView, int i) {
        C05040Rr.A00(AnonymousClass0Y8.A07(context, i), imageView);
    }

    public static void A0m(Context context, TemplateQuickReplyButtonsLayout templateQuickReplyButtonsLayout) {
        templateQuickReplyButtonsLayout.A01();
        templateQuickReplyButtonsLayout.A06 = new View[3];
        templateQuickReplyButtonsLayout.A07 = new View[3];
        View.inflate(context, R.layout.f8nameremoved, templateQuickReplyButtonsLayout);
    }

    public static void A0p(Canvas canvas, Paint paint, Drawable drawable, float f, int i) {
        canvas.save();
        Rect bounds = drawable.getBounds();
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        canvas.translate(f, ((float) i) + (((fontMetrics.ascent + fontMetrics.descent) - ((float) bounds.height())) / 2.0f));
        drawable.draw(canvas);
        canvas.restore();
    }

    public static void A0r(Bundle bundle, String str, Collection collection) {
        bundle.putStringArrayList(str, C627336j.A0A(collection));
    }

    public static void A0s(Handler handler, Runnable runnable) {
        handler.removeCallbacks(runnable);
        handler.postDelayed(runnable, 200);
    }

    public static void A0u(MenuItem menuItem, List list) {
        menuItem.setVisible(!list.isEmpty());
    }

    public static void A0w(View view) {
        C626936e.A04(view);
        view.setVisibility(8);
    }

    public static void A0x(View view, int i) {
        view.findViewById(i).setVisibility(4);
    }

    public static void A0y(View view, int i) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = i;
            view.setLayoutParams(layoutParams);
        }
    }

    public static void A0z(View view, int i) {
        view.setPadding(i, view.getPaddingTop(), i, view.getPaddingBottom());
    }

    public static void A10(View view, int i, int i2, int i3) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, i2), i3);
    }

    public static void A11(View view, View view2, int i) {
        view.setVisibility(i);
        if (view2 != null) {
            view2.setVisibility(i);
        }
    }

    public static void A12(View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        view.getViewTreeObserver().addOnGlobalLayoutListener(onGlobalLayoutListener);
    }

    public static void A14(View view, InputMethodManager inputMethodManager) {
        inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    public static void A16(View view, CharSequence charSequence, int i) {
        C88694ab.A02(view, charSequence, i).A05();
    }

    public static void A19(Animation animation, Interpolator interpolator) {
        animation.setInterpolator(interpolator);
        animation.setDuration(300);
    }

    public static void A1C(DialogFragment dialogFragment, C003203q r2) {
        AnonymousClass344.A01(dialogFragment, r2.getSupportFragmentManager());
    }

    public static void A1F(AnonymousClass0R6 r0, Collection collection, List list) {
        list.clear();
        list.addAll(collection);
        r0.A05();
    }

    public static void A1H(MaterialButton materialButton) {
        materialButton.A00(materialButton.getMeasuredWidth(), materialButton.getMeasuredHeight());
    }

    public static void A1O(C88504Yz r2, List list, int i) {
        r2.A07((AnonymousClass5C8) list.get(i), (List) null);
    }

    public static void A1V(Object obj, List list) {
        if (!list.contains(obj)) {
            list.add(obj);
        }
    }

    public static boolean A1X(View view) {
        return ((AccessibilityManager) view.getContext().getSystemService("accessibility")).isTouchExplorationEnabled();
    }

    public static boolean A1Y(AnonymousClass3ZH r0, Class cls, Set set) {
        return set.contains(r0.A0I(cls));
    }
}
