package X;

import androidx.appcompat.widget.SwitchCompat;
import com.whatsapp.wds.components.toggle.WDSSwitch;
import java.lang.reflect.Field;

/* renamed from: X.7Ib  reason: invalid class name and case insensitive filesystem */
public final class C148357Ib {
    public final WDSSwitch A00;
    public final Field A01;

    public C148357Ib(WDSSwitch wDSSwitch) {
        Field field;
        this.A00 = wDSSwitch;
        try {
            field = SwitchCompat.class.getDeclaredField("mThumbPosition");
            C162457s7.A0D(field);
            field.setAccessible(true);
        } catch (Exception unused) {
            field = null;
        }
        this.A01 = field;
    }
}
