package X;

import android.widget.RadioGroup;
import androidx.fragment.app.DialogFragment;
import com.whatsapp.R;
import com.whatsapp.mediacomposer.MediaComposerActivity;
import com.whatsapp.mediacomposer.bottomsheet.ImageQualitySettingsBottomSheetFragment;
import com.whatsapp.mediacomposer.bottomsheet.MediaQualitySettingsBottomSheetFragment;
import com.whatsapp.mediacomposer.bottomsheet.VideoQualitySettingsBottomSheetFragment;
import com.whatsapp.newsletter.ui.directory.NewsletterDirectoryActivity;
import java.util.SortedMap;

/* renamed from: X.69B  reason: invalid class name */
public class AnonymousClass69B implements RadioGroup.OnCheckedChangeListener {
    public Object A00;
    public final int A01;

    public AnonymousClass69B(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void onCheckedChanged(RadioGroup radioGroup, int i) {
        SortedMap sortedMap;
        C999458u r1;
        C179568jM r5;
        int i2;
        Object[] objArr;
        int i3;
        int i4;
        if (this.A01 != 0) {
            DialogFragment dialogFragment = (DialogFragment) this.A00;
            if (i == R.id.popularity || i != R.id.recent) {
                r1 = C999458u.POPULARITY;
            } else {
                r1 = C999458u.RECENT;
            }
            C003203q A0Q = dialogFragment.A0Q();
            if ((A0Q instanceof C179568jM) && (r5 = (C179568jM) A0Q) != null) {
                NewsletterDirectoryActivity newsletterDirectoryActivity = (NewsletterDirectoryActivity) r5;
                C162457s7.A0J(r1, 0);
                newsletterDirectoryActivity.A0B = r1;
                newsletterDirectoryActivity.A78((Integer) null, false);
                C620633i r4 = newsletterDirectoryActivity.A08;
                int ordinal = newsletterDirectoryActivity.A0B.ordinal();
                if (ordinal == 1) {
                    i2 = R.string.f11nameremoved;
                    objArr = new Object[1];
                    i3 = R.string.f11nameremoved;
                } else if (ordinal == 0) {
                    i2 = R.string.f11nameremoved;
                    objArr = new Object[1];
                    i3 = R.string.f11nameremoved;
                } else {
                    throw C73153f1.A00();
                }
                C107295b4.A00(newsletterDirectoryActivity, r4, C18300x5.A0e(newsletterDirectoryActivity, newsletterDirectoryActivity.getString(i3), objArr, 0, i2));
                int ordinal2 = newsletterDirectoryActivity.A0B.ordinal();
                if (ordinal2 == 1) {
                    i4 = 9;
                } else if (ordinal2 == 0) {
                    i4 = 10;
                } else {
                    throw C73153f1.A00();
                }
                newsletterDirectoryActivity.A74().A0E((Integer) null, (Integer) null, (String) null, i4);
            }
            dialogFragment.A1K();
            return;
        }
        MediaQualitySettingsBottomSheetFragment mediaQualitySettingsBottomSheetFragment = (MediaQualitySettingsBottomSheetFragment) this.A00;
        if (mediaQualitySettingsBottomSheetFragment instanceof VideoQualitySettingsBottomSheetFragment) {
            sortedMap = ((VideoQualitySettingsBottomSheetFragment) mediaQualitySettingsBottomSheetFragment).A03;
        } else {
            sortedMap = ((ImageQualitySettingsBottomSheetFragment) mediaQualitySettingsBottomSheetFragment).A04;
        }
        AnonymousClass7YH r0 = (AnonymousClass7YH) AnonymousClass001.A0i(sortedMap, i);
        if (r0 != null) {
            mediaQualitySettingsBottomSheetFragment.A00 = r0.A00;
        }
        AnonymousClass1VX r12 = mediaQualitySettingsBottomSheetFragment.A04;
        if (r12 == null) {
            throw C18270x1.A0R();
        } else if (r12.A0X(4244)) {
            C182648ol r13 = mediaQualitySettingsBottomSheetFragment.A07;
            if (r13 != null) {
                r13.BWA(Integer.valueOf(mediaQualitySettingsBottomSheetFragment.A00));
            }
            mediaQualitySettingsBottomSheetFragment.A1K();
        } else {
            C182648ol r3 = mediaQualitySettingsBottomSheetFragment.A07;
            if (r3 != null) {
                Integer valueOf = Integer.valueOf(mediaQualitySettingsBottomSheetFragment.A00);
                MediaComposerActivity mediaComposerActivity = (MediaComposerActivity) r3;
                C18260x0.A1P(AnonymousClass001.A0o(), "MediaComposerActivity/onMediaQualitySelectionChanged/", valueOf);
                if (valueOf != null && valueOf.intValue() == 3 && mediaComposerActivity.A0D.A0X(3307)) {
                    mediaComposerActivity.A04.BkN(mediaComposerActivity.A1S, "data_warning_runnable_tag");
                }
            }
        }
    }
}
