package dev.starlai.archi.ui.setting;

/**
 * Created by izayoi on 11/9/2016.
 */

public interface SettingsContract {

    public interface View {
        void showContainerSettings();

    }

    public interface Actions {
        boolean onPasswordValidation(String password);

    }


}
