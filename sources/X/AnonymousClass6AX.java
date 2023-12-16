package X;

import android.net.Uri;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.contact.picker.SharedTextPreviewDialogFragment;
import com.whatsapp.mentions.MentionableEntry;
import com.whatsapp.textstatuscomposer.TextStatusComposerActivity;
import com.whatsapp.util.Log;
import com.whatsapp.webpagepreview.WebPagePreviewView;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: X.6AX  reason: invalid class name */
public class AnonymousClass6AX implements C184388ri {
    public Object A00;
    public final int A01;

    public AnonymousClass6AX(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void BTT(File file, String str, byte[] bArr) {
        String str2;
        File file2 = file;
        switch (this.A01) {
            case 0:
                SharedTextPreviewDialogFragment sharedTextPreviewDialogFragment = (SharedTextPreviewDialogFragment) ((AnonymousClass54F) this.A00).A00;
                sharedTextPreviewDialogFragment.A0F.setImageProgressBarVisibility(false);
                sharedTextPreviewDialogFragment.A0F.A0L(true, false);
                if (file == null) {
                    str2 = "sharedtextpreviewdialogfragment/gif-preview/file is null";
                    break;
                } else {
                    sharedTextPreviewDialogFragment.startActivityForResult(AnonymousClass59p.A00(sharedTextPreviewDialogFragment.A0Q(), sharedTextPreviewDialogFragment.A0F, sharedTextPreviewDialogFragment.A0G, (C624134x) null, file2, sharedTextPreviewDialogFragment.A0G), 27);
                    return;
                }
            case 1:
                AnonymousClass5KX r3 = (AnonymousClass5KX) this.A00;
                WebPagePreviewView webPagePreviewView = r3.A05;
                webPagePreviewView.setImageProgressBarVisibility(false);
                webPagePreviewView.A0L(true, r3.A06);
                if (file == null) {
                    str2 = "ConversationShellWebPagePreviewController/onFileReceived/gif is null";
                    break;
                } else {
                    AnonymousClass6BY r1 = (AnonymousClass6BY) r3.A02;
                    if (r1.A01 != 0) {
                        C113245l7 r12 = (C113245l7) r1.A00;
                        C89644eZ A09 = C113245l7.A09(r12);
                        MentionableEntry mentionableEntry = r12.A4P;
                        r12.A2z.BpY(AnonymousClass59p.A00(A09, r12.A4O, mentionableEntry, r12.A3B.A0G, file2, Collections.singletonList(r12.A4J)), 27);
                        return;
                    }
                    return;
                }
            default:
                AnonymousClass54E r2 = (AnonymousClass54E) this.A00;
                TextStatusComposerActivity textStatusComposerActivity = (TextStatusComposerActivity) r2.A00;
                textStatusComposerActivity.A0r.setImageProgressBarVisibility(false);
                ((View) r2.A01).setVisibility(0);
                if (file == null) {
                    str2 = "textstatus/gif-preview/file is null";
                    break;
                } else {
                    Uri fromFile = Uri.fromFile(AnonymousClass002.A0B(file.getAbsolutePath()));
                    ArrayList A0s = C18300x5.A0s(fromFile);
                    String stringText = textStatusComposerActivity.A0j.getStringText();
                    AnonymousClass5YF r13 = new AnonymousClass5YF(fromFile);
                    r13.A0G(stringText);
                    r13.A0F((byte) 13);
                    C106105Xq r32 = new C106105Xq(r13);
                    AnonymousClass5PE r22 = new AnonymousClass5PE(textStatusComposerActivity);
                    r22.A0G = A0s;
                    r22.A0C = C135166kE.A00.getRawString();
                    r22.A02 = 9;
                    r22.A0K = true;
                    AnonymousClass5PE.A00(r32, r22);
                    textStatusComposerActivity.BpY(r22.A01(), 1);
                    return;
                }
        }
        Log.e(str2);
    }

    public void onFailure(Exception exc) {
        if (1 - this.A01 == 0) {
            AnonymousClass5KX r4 = (AnonymousClass5KX) this.A00;
            WebPagePreviewView webPagePreviewView = r4.A05;
            webPagePreviewView.setImageProgressBarVisibility(false);
            webPagePreviewView.A0L(true, r4.A06);
            AnonymousClass6BY r1 = (AnonymousClass6BY) r4.A02;
            if (r1.A01 != 0 && (exc instanceof IOException)) {
                C113245l7.A07((C113245l7) r1.A00).A0I(R.string.f11nameremoved, 0);
            }
        }
    }
}
