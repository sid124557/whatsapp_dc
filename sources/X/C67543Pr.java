package X;

import android.util.JsonReader;
import android.util.JsonWriter;
import com.whatsapp.EmojiPicker$EmojiWeight;
import com.whatsapp.util.Log;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.3Pr  reason: invalid class name and case insensitive filesystem */
public class C67543Pr implements AnonymousClass4ET {
    public final C55682qk A00;
    public final C54292oU A01;
    public final AnonymousClass1VX A02;

    public /* bridge */ /* synthetic */ AnonymousClass4F8 B0c(Object obj, float f) {
        return new EmojiPicker$EmojiWeight((int[]) obj, 1.0f);
    }

    public List BFm() {
        JsonReader jsonReader;
        File A0A = AnonymousClass002.A0A(C54292oU.A03(this.A01), "emoji");
        ArrayList arrayList = null;
        if (A0A.exists()) {
            try {
                ArrayList A0s = AnonymousClass001.A0s();
                jsonReader = new JsonReader(new FileReader(A0A));
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    if ("weights".equals(jsonReader.nextName())) {
                        jsonReader.beginObject();
                        while (jsonReader.hasNext()) {
                            A0s.add(new EmojiPicker$EmojiWeight(C106655Zv.A00(jsonReader.nextName()).A00, (float) jsonReader.nextDouble()));
                        }
                        jsonReader.endObject();
                    } else {
                        jsonReader.skipValue();
                    }
                }
                jsonReader.endObject();
                jsonReader.close();
                arrayList = A0s;
                if (!this.A02.A0Y(C58422vE.A02, 2880)) {
                    AnonymousClass367.A01(new AnonymousClass4KD((Set) C155427er.A00.get(), 3), A0s);
                }
            } catch (Exception e) {
                Log.e("recentemoji/readrecent ", e);
                this.A00.A0A("recentemoji/load-error", false, e.toString());
                A0A.delete();
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        }
        if (arrayList == null) {
            return AnonymousClass001.A0s();
        }
        return arrayList;
        throw th;
    }

    public void Bgs(List list) {
        JsonWriter jsonWriter;
        try {
            File A0A = AnonymousClass002.A0A(C54292oU.A03(this.A01), "emoji");
            C55682qk r5 = this.A00;
            jsonWriter = new JsonWriter(new BufferedWriter(new FileWriter(A0A)));
            jsonWriter.beginObject();
            jsonWriter.name("weights");
            jsonWriter.beginObject();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                EmojiPicker$EmojiWeight emojiPicker$EmojiWeight = (EmojiPicker$EmojiWeight) it.next();
                int[] iArr = emojiPicker$EmojiWeight.A01;
                if (iArr == null) {
                    r5.A0A("RecentEmojiHelper/persistListJson/emoji is null", true, (String) null);
                } else {
                    jsonWriter.name(C106655Zv.A01(iArr));
                    jsonWriter.value((double) emojiPicker$EmojiWeight.A00);
                }
            }
            jsonWriter.endObject();
            jsonWriter.endObject();
            jsonWriter.close();
            return;
        } catch (IOException e) {
            Log.e((Throwable) e);
            this.A00.A0A("recentemoji/save-error", false, e.toString());
            return;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    public C67543Pr(C55682qk r1, C54292oU r2, AnonymousClass1VX r3) {
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r1;
    }
}
