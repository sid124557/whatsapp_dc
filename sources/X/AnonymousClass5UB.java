package X;

import android.content.Context;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.CircularProgressBar;
import com.whatsapp.R;
import com.whatsapp.audiopicker.AudioPickerActivity;
import com.whatsapp.components.SelectionCheckView;
import java.io.File;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* renamed from: X.5UB  reason: invalid class name */
public class AnonymousClass5UB {
    public final int A00;
    public final View A01;
    public final View A02;
    public final FrameLayout A03;
    public final ImageButton A04;
    public final ImageView A05;
    public final TextView A06;
    public final TextView A07;
    public final TextView A08;
    public final TextView A09;
    public final CircularProgressBar A0A;
    public final SelectionCheckView A0B;
    public final /* synthetic */ AudioPickerActivity A0C;

    public AnonymousClass5UB(View view, AudioPickerActivity audioPickerActivity, int i) {
        this.A0C = audioPickerActivity;
        this.A00 = i;
        this.A02 = view;
        this.A03 = C86664Kz.A0s(view, R.id.audio_file_thumb_frame);
        this.A05 = AnonymousClass0x9.A0F(view, R.id.audio_file_thumb);
        this.A0B = (SelectionCheckView) view.findViewById(R.id.selection_check);
        this.A09 = AnonymousClass002.A09(view, R.id.audio_file_title);
        this.A06 = AnonymousClass002.A09(view, R.id.audio_file_artist);
        this.A07 = AnonymousClass002.A09(view, R.id.audio_file_duration);
        this.A08 = AnonymousClass002.A09(view, R.id.audio_file_size);
        this.A01 = view.findViewById(R.id.bullet_duration_size);
        this.A04 = (ImageButton) view.findViewById(R.id.audio_file_play_btn);
        this.A0A = (CircularProgressBar) view.findViewById(R.id.progress_bar);
    }

    public final void A00(Context context) {
        ImageButton imageButton = this.A04;
        AudioPickerActivity audioPickerActivity = this.A0C;
        C18300x5.A13(audioPickerActivity, imageButton, R.string.f11nameremoved);
        imageButton.setBackground((Drawable) null);
        C18270x1.A0d(context, imageButton, audioPickerActivity.A00, R.drawable.pause);
        C107335b8.A0E(imageButton, C18300x5.A03(audioPickerActivity, R.attr.f3nameremoved, R.color.f5nameremoved));
        this.A0A.setVisibility(0);
    }

    public final void A01(Context context, boolean z) {
        CircularProgressBar circularProgressBar;
        int i;
        ImageButton imageButton = this.A04;
        AudioPickerActivity audioPickerActivity = this.A0C;
        C18300x5.A13(audioPickerActivity, imageButton, R.string.f11nameremoved);
        if (z) {
            imageButton.setBackground(AnonymousClass0x7.A0J(context, audioPickerActivity.A00, R.drawable.audio_picker_row_start_button_background));
            C18270x1.A0d(context, imageButton, audioPickerActivity.A00, R.drawable.play_button_audio);
            C107335b8.A0E(imageButton, AnonymousClass0Y8.A04(audioPickerActivity, R.color.f5nameremoved));
            circularProgressBar = this.A0A;
            i = 8;
        } else {
            imageButton.setBackground((Drawable) null);
            C18270x1.A0d(context, imageButton, audioPickerActivity.A00, R.drawable.toggle_play);
            C107335b8.A0E(imageButton, C18300x5.A03(audioPickerActivity, R.attr.f3nameremoved, R.color.f5nameremoved));
            circularProgressBar = this.A0A;
            i = 0;
        }
        circularProgressBar.setVisibility(i);
    }

    public final void A02(View view) {
        String A0q;
        C69263Wi r6;
        String string;
        AudioPickerActivity audioPickerActivity = this.A0C;
        C87224Om r1 = audioPickerActivity.A09;
        C102885Kq A002 = r1.A00((Cursor) r1.getItem(this.A00));
        if (A002 != null) {
            int A0I = C86664Kz.A0I(audioPickerActivity.A0D);
            if (audioPickerActivity.A0R.size() >= A0I) {
                A0I = audioPickerActivity.A0D.A0N(2693);
            }
            LinkedHashMap linkedHashMap = audioPickerActivity.A0R;
            if (linkedHashMap.size() >= A0I && !linkedHashMap.containsKey(Integer.valueOf(A002.A00))) {
                r6 = audioPickerActivity.A05;
                string = C86604Kt.A0q(audioPickerActivity.A00, A0I, 0, R.plurals.f9nameremoved);
            } else if (((long) A002.A01) >= C56952sp.A06(audioPickerActivity.A0D, 3657) * SearchActionVerificationClientService.MS_TO_NS) {
                r6 = audioPickerActivity.A05;
                Object[] objArr = new Object[1];
                AnonymousClass000.A1P(objArr, audioPickerActivity.A0D.A0N(3657), 0);
                string = audioPickerActivity.getString(R.string.f11nameremoved, objArr);
            } else {
                int i = A002.A00;
                LinkedHashMap linkedHashMap2 = audioPickerActivity.A0R;
                Integer valueOf = Integer.valueOf(i);
                boolean containsKey = linkedHashMap2.containsKey(valueOf);
                A04(A002, !containsKey);
                LinkedHashMap linkedHashMap3 = audioPickerActivity.A0R;
                if (containsKey) {
                    linkedHashMap3.remove(valueOf);
                    view.setSelected(false);
                    view.setBackgroundResource(0);
                    ((SelectionCheckView) view.findViewById(R.id.selection_check)).A04();
                } else {
                    linkedHashMap3.put(valueOf, A002);
                    view.setSelected(true);
                    AnonymousClass5Yj.A0A(view.getContext(), view, R.attr.f3nameremoved, R.color.f5nameremoved);
                    ((SelectionCheckView) view.findViewById(R.id.selection_check)).A03();
                }
                int size = audioPickerActivity.A0R.size();
                ImageButton imageButton = audioPickerActivity.A03;
                if (size == 0) {
                    AnonymousClass5VQ.A01(imageButton, false, true);
                    A0q = audioPickerActivity.getString(R.string.f11nameremoved);
                } else {
                    AnonymousClass5VQ.A01(imageButton, true, true);
                    A0q = C86604Kt.A0q(audioPickerActivity.A00, size, 0, R.plurals.f9nameremoved);
                }
                AnonymousClass0R8 supportActionBar = audioPickerActivity.getSupportActionBar();
                C626936e.A07(supportActionBar, "supportActionBar is null");
                supportActionBar.A0I(A0q);
                return;
            }
            r6.A0P(string, 0);
        }
    }

    public void A03(C89654ea r23, C102885Kq r24) {
        long A012;
        TextView textView;
        float f;
        View view = this.A02;
        C18280x3.A0p(view, this, 37);
        AnonymousClass692.A00(view, this, 4);
        C102885Kq r6 = r24;
        String str = r6.A03;
        File file = null;
        if (str != null) {
            file = AnonymousClass002.A0B(str);
        }
        int i = r6.A00;
        int i2 = i;
        C114235mi r2 = new C114235mi(this, (long) i);
        C114265ml r1 = new C114265ml(this);
        AudioPickerActivity audioPickerActivity = this.A0C;
        audioPickerActivity.A0J.A02(r2, r1);
        ImageView imageView = this.A05;
        imageView.setClipToOutline(true);
        C86644Kx.A1A(imageView);
        TextView textView2 = this.A09;
        String str2 = r6.A07;
        ArrayList arrayList = audioPickerActivity.A0Q;
        C620733j r0 = audioPickerActivity.A00;
        C107075ae r15 = C107075ae.A03;
        C89654ea r10 = r23;
        textView2.setText(C86644Kx.A0d(r10, r0, r15, str2, arrayList));
        String str3 = r6.A02;
        TextView textView3 = this.A06;
        if (str3 != null) {
            textView3.setVisibility(0);
            textView3.setText(C86644Kx.A0d(r10, audioPickerActivity.A00, r15, str3, audioPickerActivity.A0Q));
        } else {
            textView3.setVisibility(8);
        }
        String str4 = r6.A05;
        boolean isEmpty = str4.isEmpty();
        TextView textView4 = this.A07;
        if (!isEmpty) {
            textView4.setVisibility(0);
            textView4.setText(str4);
        } else {
            textView4.setVisibility(8);
        }
        String str5 = r6.A06;
        boolean isEmpty2 = str5.isEmpty();
        if (!isEmpty2) {
            if (((long) r6.A01) >= C56952sp.A06(audioPickerActivity.A0D, 3657) * SearchActionVerificationClientService.MS_TO_NS) {
                SpannableString A0A2 = AnonymousClass4L0.A0A(str5);
                A0A2.setSpan(new ForegroundColorSpan(-65536), 0, str5.length(), 33);
                textView = this.A08;
                C86664Kz.A1T(textView, A0A2);
                f = 0.5f;
            } else {
                textView = this.A08;
                textView.setText(str5);
                f = 1.0f;
            }
            textView2.setAlpha(f);
            textView.setVisibility(0);
        } else {
            this.A08.setVisibility(8);
        }
        if (isEmpty || isEmpty2) {
            this.A01.setVisibility(8);
        } else {
            this.A01.setVisibility(0);
        }
        boolean containsKey = audioPickerActivity.A0R.containsKey(Integer.valueOf(i2));
        if (containsKey) {
            view.setSelected(true);
            AnonymousClass5Yj.A0A(view.getContext(), view, R.attr.f3nameremoved, R.color.f5nameremoved);
            SelectionCheckView selectionCheckView = this.A0B;
            selectionCheckView.setVisibility(0);
            C86654Ky.A18(selectionCheckView.A0B, selectionCheckView, 0);
        } else {
            view.setBackgroundResource(0);
            SelectionCheckView selectionCheckView2 = this.A0B;
            C86654Ky.A18(selectionCheckView2.A0B, selectionCheckView2, 4);
            selectionCheckView2.setVisibility(4);
        }
        A04(r6, containsKey);
        CircularProgressBar circularProgressBar = this.A0A;
        circularProgressBar.A0B = AnonymousClass0Y8.A04(r10, R.color.f5nameremoved);
        circularProgressBar.A0C = C18300x5.A03(r10, R.attr.f3nameremoved, R.color.f5nameremoved);
        circularProgressBar.A05 = 0.1f;
        circularProgressBar.A06 = 10.0f;
        circularProgressBar.setIndeterminate(false);
        C30721mu r8 = new C30721mu(new AnonymousClass2z0((C95814uZ) null, Integer.toString(i2), true), 0);
        r8.A09 = 2;
        AnonymousClass33C r02 = new AnonymousClass33C();
        r02.A0F = file;
        r8.A01 = r02;
        if (!audioPickerActivity.A0H.A0D(r8)) {
            A01(r10, true);
            circularProgressBar.setMax(r8.A0B * 1000);
            circularProgressBar.setProgress(0);
            A012 = 0;
        } else {
            C116095pj A002 = audioPickerActivity.A0H.A00();
            if (A002 != null) {
                circularProgressBar.setMax(A002.A03);
                if (A002.A0I()) {
                    A00(r10);
                } else if (A002.A01() > 0) {
                    A01(r10, false);
                } else {
                    A01(r10, true);
                    circularProgressBar.setProgress(0);
                    circularProgressBar.setMax(A002.A03);
                    A002.A0J = new C113135kw(r10, this, A002, r8);
                    A012 = (long) A002.A01();
                }
                circularProgressBar.setProgress(A002.A01());
                circularProgressBar.setMax(A002.A03);
                A002.A0J = new C113135kw(r10, this, A002, r8);
                A012 = (long) A002.A01();
            }
            this.A04.setOnClickListener(new C109565ep(this, r8, r6, r10, 0));
        }
        circularProgressBar.setContentDescription(AnonymousClass0x2.A0X(audioPickerActivity, C107565bW.A0B(audioPickerActivity.A00, A012), 1, R.string.f11nameremoved));
        this.A04.setOnClickListener(new C109565ep(this, r8, r6, r10, 0));
    }

    public final void A04(C102885Kq r11, boolean z) {
        int i;
        Object[] objArr;
        String str = r11.A02;
        View view = this.A02;
        AudioPickerActivity audioPickerActivity = this.A0C;
        if (str != null) {
            i = R.string.f11nameremoved;
            if (z) {
                i = R.string.f11nameremoved;
            }
            objArr = new Object[]{r11.A07, str, r11.A04, r11.A06};
        } else {
            int i2 = R.string.f11nameremoved;
            if (z) {
                i2 = R.string.f11nameremoved;
            }
            objArr = new Object[]{r11.A07, r11.A04, r11.A06};
        }
        C86624Kv.A0h(audioPickerActivity, view, objArr, i);
    }
}
